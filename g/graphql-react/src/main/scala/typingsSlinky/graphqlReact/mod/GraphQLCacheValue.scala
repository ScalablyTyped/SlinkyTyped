package typingsSlinky.graphqlReact.mod

import typingsSlinky.graphqlReact.AnonLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLCacheValue[T] extends js.Object {
  var data: T = js.native
  var fetchError: Null | String = js.native
  var graphQLErrors: Null | js.Array[AnonLocations] = js.native
  var httpError: Null | HttpError = js.native
  var parseError: Null | String = js.native
}

object GraphQLCacheValue {
  @scala.inline
  def apply[T](data: T): GraphQLCacheValue[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLCacheValue[T]]
  }
  @scala.inline
  implicit class GraphQLCacheValueOps[Self[t] <: GraphQLCacheValue[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchError(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchErrorNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchError")(null)
        ret
    }
    @scala.inline
    def withGraphQLErrors(value: js.Array[AnonLocations]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphQLErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphQLErrorsNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphQLErrors")(null)
        ret
    }
    @scala.inline
    def withHttpError(value: HttpError): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpErrorNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpError")(null)
        ret
    }
    @scala.inline
    def withParseError(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseErrorNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseError")(null)
        ret
    }
  }
  
}

