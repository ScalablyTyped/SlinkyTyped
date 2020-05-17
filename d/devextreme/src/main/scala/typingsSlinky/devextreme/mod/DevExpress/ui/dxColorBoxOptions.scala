package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxColorBoxOptions extends dxDropDownEditorOptions[dxColorBox] {
  /** Specifies the text displayed on the button that applies changes and closes the drop-down editor. */
  var applyButtonText: js.UndefOr[String] = js.native
  /** Specifies the text displayed on the button that cancels changes and closes the drop-down editor. */
  var cancelButtonText: js.UndefOr[String] = js.native
  /** Specifies whether or not the widget value includes the alpha channel component. */
  var editAlphaChannel: js.UndefOr[Boolean] = js.native
  /** Specifies a custom template for the input field. Must contain the TextBox widget. */
  var fieldTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ String, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Specifies the size of a step by which a handle is moved using a keyboard shortcut. */
  var keyStep: js.UndefOr[Double] = js.native
}

object dxColorBoxOptions {
  @scala.inline
  def apply(): dxColorBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxColorBoxOptions]
  }
  @scala.inline
  implicit class dxColorBoxOptionsOps[Self <: dxColorBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withEditAlphaChannel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editAlphaChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditAlphaChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editAlphaChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldTemplateFunction2(value: (/* value */ String, /* fieldElement */ dxElement) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFieldTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ String, /* fieldElement */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyStep")(js.undefined)
        ret
    }
  }
  
}

