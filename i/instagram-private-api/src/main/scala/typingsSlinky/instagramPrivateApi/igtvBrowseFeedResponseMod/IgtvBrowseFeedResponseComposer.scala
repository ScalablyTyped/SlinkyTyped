package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvBrowseFeedResponseComposer extends js.Object {
  var aspect_ratio_finished: Boolean = js.native
  var nux_finished: Boolean = js.native
}

object IgtvBrowseFeedResponseComposer {
  @scala.inline
  def apply(aspect_ratio_finished: Boolean, nux_finished: Boolean): IgtvBrowseFeedResponseComposer = {
    val __obj = js.Dynamic.literal(aspect_ratio_finished = aspect_ratio_finished.asInstanceOf[js.Any], nux_finished = nux_finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseComposer]
  }
  @scala.inline
  implicit class IgtvBrowseFeedResponseComposerOps[Self <: IgtvBrowseFeedResponseComposer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspect_ratio_finished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect_ratio_finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNux_finished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nux_finished")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

