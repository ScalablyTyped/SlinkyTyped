package typingsSlinky.googleapisCommon.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APIRequestParams[T] extends js.Object {
  var context: APIRequestContext = js.native
  var mediaUrl: js.UndefOr[String | Null] = js.native
  var options: MethodOptions = js.native
  var params: T = js.native
  var pathParams: js.Array[String] = js.native
  var requiredParams: js.Array[String] = js.native
}

object APIRequestParams {
  @scala.inline
  def apply[T](
    context: APIRequestContext,
    options: MethodOptions,
    params: T,
    pathParams: js.Array[String],
    requiredParams: js.Array[String]
  ): APIRequestParams[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], requiredParams = requiredParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIRequestParams[T]]
  }
  @scala.inline
  implicit class APIRequestParamsOps[Self[t] <: APIRequestParams[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContext(value: APIRequestContext): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: MethodOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathParams(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredParams(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaUrl(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaUrl: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaUrlNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUrl")(null)
        ret
    }
  }
  
}

