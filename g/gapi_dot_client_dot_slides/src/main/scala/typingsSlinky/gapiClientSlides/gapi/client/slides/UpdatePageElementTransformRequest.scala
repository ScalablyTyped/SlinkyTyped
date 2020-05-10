package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePageElementTransformRequest extends js.Object {
  /** The apply mode of the transform update. */
  var applyMode: js.UndefOr[String] = js.native
  /** The object ID of the page element to update. */
  var objectId: js.UndefOr[String] = js.native
  /** The input transform matrix used to update the page element. */
  var transform: js.UndefOr[AffineTransform] = js.native
}

object UpdatePageElementTransformRequest {
  @scala.inline
  def apply(): UpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePageElementTransformRequest]
  }
  @scala.inline
  implicit class UpdatePageElementTransformRequestOps[Self <: UpdatePageElementTransformRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMode")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: AffineTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

