package typingsSlinky.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] extends RefinedBatchRequest[RT] {
  var body: js.UndefOr[RequestBody | Null] = js.native
  var method: String = js.native
  var params: js.UndefOr[RefinedParams[RT] | Null] = js.native
  var url: String = js.native
}

object ObjectRefinedBatchRequest {
  @scala.inline
  def apply[RT](method: String, url: String): ObjectRefinedBatchRequest[RT] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectRefinedBatchRequest[RT]]
  }
  @scala.inline
  implicit class ObjectRefinedBatchRequestOps[Self[rt] <: ObjectRefinedBatchRequest[rt], RT] (val x: Self[RT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RT] with Other]
    @scala.inline
    def withMethod(value: String): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: RequestBody): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyNull: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(null)
        ret
    }
    @scala.inline
    def withParams(value: RefinedParams[RT]): Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsNull: Self[RT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(null)
        ret
    }
  }
  
}

