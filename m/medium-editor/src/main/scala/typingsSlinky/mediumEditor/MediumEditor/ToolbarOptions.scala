package typingsSlinky.mediumEditor.MediumEditor

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarOptions extends js.Object {
  var align: js.UndefOr[String] = js.native
  var allowMultiParagraphSelection: js.UndefOr[Boolean] = js.native
  var buttons: js.UndefOr[js.Array[Button]] = js.native
  var diffLeft: js.UndefOr[Double] = js.native
  var diffTop: js.UndefOr[Double] = js.native
  var firstButtonClass: js.UndefOr[String] = js.native
  var lastButtonClass: js.UndefOr[String] = js.native
  var relativeContainer: js.UndefOr[Node] = js.native
  var standardizeSelectionStart: js.UndefOr[Boolean] = js.native
  var static: js.UndefOr[Boolean] = js.native
  var sticky: js.UndefOr[Boolean] = js.native
  var stickyTopOffset: js.UndefOr[Double] = js.native
  var updateOnEmptySelection: js.UndefOr[Boolean] = js.native
}

object ToolbarOptions {
  @scala.inline
  def apply(): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions]
  }
  @scala.inline
  implicit class ToolbarOptionsOps[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiParagraphSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiParagraphSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiParagraphSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiParagraphSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[Button]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffTop")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstButtonClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstButtonClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstButtonClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstButtonClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLastButtonClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastButtonClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastButtonClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastButtonClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeContainer(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardizeSelectionStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardizeSelectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardizeSelectionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardizeSelectionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sticky")(js.undefined)
        ret
    }
    @scala.inline
    def withStickyTopOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyTopOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickyTopOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyTopOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOnEmptySelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnEmptySelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnEmptySelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnEmptySelection")(js.undefined)
        ret
    }
  }
  
}

