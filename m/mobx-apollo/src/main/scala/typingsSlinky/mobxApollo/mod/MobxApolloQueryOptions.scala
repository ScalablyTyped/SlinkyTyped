package typingsSlinky.mobxApollo.mod

import typingsSlinky.apolloClient.mod.ApolloClient
import typingsSlinky.apolloClient.mod.ApolloError
import typingsSlinky.apolloClient.typesMod.OperationVariables
import typingsSlinky.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import typingsSlinky.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobxApolloQueryOptions[T] extends WatchQueryOptions[OperationVariables] {
  var client: ApolloClient[_] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ ApolloError, Unit]] = js.native
  var onFetch: js.UndefOr[js.Function1[/* result */ T, Unit]] = js.native
}

object MobxApolloQueryOptions {
  @scala.inline
  def apply[T](client: ApolloClient[_], query: DocumentNode): MobxApolloQueryOptions[T] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobxApolloQueryOptions[T]]
  }
  @scala.inline
  implicit class MobxApolloQueryOptionsOps[Self[t] <: MobxApolloQueryOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClient(value: ApolloClient[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ ApolloError => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFetch(value: /* result */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFetch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFetch")(js.undefined)
        ret
    }
  }
  
}

