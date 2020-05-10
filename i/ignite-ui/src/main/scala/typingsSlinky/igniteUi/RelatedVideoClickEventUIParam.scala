package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedVideoClickEventUIParam extends js.Object {
  /**
  	 * Get the relatedVideo object from the relatedVideos array.
  	 */
  var relatedVideo: js.UndefOr[js.Any] = js.native
  /**
  	 * Get the relatedVideo html element in the DOM.
  	 */
  var relatedVideoElement: js.UndefOr[js.Any] = js.native
}

object RelatedVideoClickEventUIParam {
  @scala.inline
  def apply(): RelatedVideoClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedVideoClickEventUIParam]
  }
  @scala.inline
  implicit class RelatedVideoClickEventUIParamOps[Self <: RelatedVideoClickEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelatedVideo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedVideoElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedVideoElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedVideoElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedVideoElement")(js.undefined)
        ret
    }
  }
  
}

