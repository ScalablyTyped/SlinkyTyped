package typingsSlinky.blueprintjsCore.formGroupMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormGroupProps
  extends IIntentProps
     with IProps {
  /**
    * A space-delimited list of class names to pass along to the
    * `Classes.FORM_CONTENT` element that contains `children`.
    */
  var contentClassName: js.UndefOr[String] = js.native
  /**
    * Whether form group should appear as non-interactive.
    * Remember that `input` elements must be disabled separately.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional helper text. The given content will be wrapped in
    * `Classes.FORM_HELPER_TEXT` and displayed beneath `children`.
    * Helper text color is determined by the `intent`.
    */
  var helperText: js.UndefOr[TagMod[Any]] = js.native
  /** Whether to render the label and children on a single line. */
  var `inline`: js.UndefOr[Boolean] = js.native
  /** Label of this form group. */
  var label: js.UndefOr[TagMod[Any]] = js.native
  /**
    * `id` attribute of the labelable form element that this `FormGroup` controls,
    * used as `<label for>` attribute.
    */
  var labelFor: js.UndefOr[String] = js.native
  /**
    * Optional secondary text that appears after the label.
    */
  var labelInfo: js.UndefOr[TagMod[Any]] = js.native
  /** CSS properties to apply to the root element. */
  var style: js.UndefOr[CSSProperties] = js.native
}

object IFormGroupProps {
  @scala.inline
  def apply(): IFormGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormGroupProps]
  }
  @scala.inline
  implicit class IFormGroupPropsOps[Self <: IFormGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelperText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperText")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelInfoReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelInfo(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

