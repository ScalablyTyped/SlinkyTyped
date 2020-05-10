package typingsSlinky.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFrameResultDetails extends js.Object {
  /** True if the last navigation in this frame was interrupted by an error, i.e. the onErrorOccurred event fired. */
  var errorOccurred: Boolean = js.native
  /** ID of frame that wraps the frame. Set to -1 of no parent frame exists. */
  var parentFrameId: Double = js.native
  /** The URL currently associated with this frame, if the frame identified by the frameId existed at one point in the given tab. The fact that an URL is associated with a given frameId does not imply that the corresponding frame still exists. */
  var url: String = js.native
}

object GetFrameResultDetails {
  @scala.inline
  def apply(errorOccurred: Boolean, parentFrameId: Double, url: String): GetFrameResultDetails = {
    val __obj = js.Dynamic.literal(errorOccurred = errorOccurred.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameResultDetails]
  }
  @scala.inline
  implicit class GetFrameResultDetailsOps[Self <: GetFrameResultDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorOccurred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOccurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentFrameId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFrameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

