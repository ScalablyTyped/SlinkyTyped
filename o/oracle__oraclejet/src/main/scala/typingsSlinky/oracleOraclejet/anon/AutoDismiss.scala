package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.modal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.modeless
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.overlay
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.push
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoDismiss extends js.Object {
  var autoDismiss: js.UndefOr[focusLoss | none] = js.native
  var content: String = js.native
  var displayMode: js.UndefOr[push | overlay] = js.native
  var edge: js.UndefOr[start | end | top | bottom] = js.native
  var modality: js.UndefOr[modal | modeless] = js.native
  var selector: String = js.native
  var size: js.UndefOr[String] = js.native
}

object AutoDismiss {
  @scala.inline
  def apply(content: String, selector: String): AutoDismiss = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDismiss]
  }
  @scala.inline
  implicit class AutoDismissOps[Self <: AutoDismiss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoDismiss(value: focusLoss | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMode(value: push | overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEdge(value: start | end | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(js.undefined)
        ret
    }
    @scala.inline
    def withModality(value: modal | modeless): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modality")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

