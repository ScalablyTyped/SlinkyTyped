package typingsSlinky.apolloServerPluginBase.mod

import typingsSlinky.apolloServerTypes.mod.GraphQLRequestContext
import typingsSlinky.apolloServerTypes.mod.GraphQLServiceContext
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloServerPlugin[TContext /* <: Record[String, _] */] extends js.Object {
  var requestDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContext[TContext], 
      GraphQLRequestListener[TContext] | Unit
    ]
  ] = js.native
  var serverWillStart: js.UndefOr[js.Function1[/* service */ GraphQLServiceContext, ValueOrPromise[Unit]]] = js.native
}

object ApolloServerPlugin {
  @scala.inline
  def apply[TContext](): ApolloServerPlugin[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApolloServerPlugin[TContext]]
  }
  @scala.inline
  implicit class ApolloServerPluginOps[Self[tcontext] <: ApolloServerPlugin[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withRequestDidStart(
      value: /* requestContext */ GraphQLRequestContext[TContext] => GraphQLRequestListener[TContext] | Unit
    ): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDidStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestDidStart: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDidStart")(js.undefined)
        ret
    }
    @scala.inline
    def withServerWillStart(value: /* service */ GraphQLServiceContext => ValueOrPromise[Unit]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverWillStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutServerWillStart: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverWillStart")(js.undefined)
        ret
    }
  }
  
}

