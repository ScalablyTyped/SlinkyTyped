package typingsSlinky.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TControlOptions extends js.Object {
  var anchor: js.UndefOr[ControlAnchor] = js.native
  var attachToViewer: js.UndefOr[Boolean] = js.native
  var autoFade: js.UndefOr[Boolean] = js.native
}

object TControlOptions {
  @scala.inline
  def apply(): TControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TControlOptions]
  }
  @scala.inline
  implicit class TControlOptionsOps[Self <: TControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: ControlAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachToViewer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachToViewer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachToViewer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachToViewer")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFade")(js.undefined)
        ret
    }
  }
  
}

