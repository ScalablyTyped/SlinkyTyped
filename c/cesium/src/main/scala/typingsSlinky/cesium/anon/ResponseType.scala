package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseType extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var overrideMimeType: js.UndefOr[String] = js.native
  var responseType: js.UndefOr[String] = js.native
}

object ResponseType {
  @scala.inline
  def apply(): ResponseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseType]
  }
  @scala.inline
  implicit class ResponseTypeOps[Self <: ResponseType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
  }
  
}

