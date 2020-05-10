package typingsSlinky.blueprintjsCore.abstractButtonMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.alignmentMod.Alignment
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.button
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.reset
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.submit
import typingsSlinky.blueprintjsCore.propsMod.IActionProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButtonProps extends IActionProps {
  /**
    * If set to `true`, the button will display in an active state.
    * This is equivalent to setting `className={Classes.ACTIVE}`.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Text alignment within button. By default, icons and text will be centered
    * within the button. Passing `"left"` or `"right"` will align the button
    * text to that side and push `icon` and `rightIcon` to either edge. Passing
    * `"center"` will center the text and icons together.
    * @default Alignment.CENTER
    */
  var alignText: js.UndefOr[Alignment] = js.native
  /** A ref handler that receives the native HTML element backing this component. */
  var elementRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  /** Whether this button should expand to fill its container. */
  var fill: js.UndefOr[Boolean] = js.native
  /** Whether this button should use large styles. */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * If set to `true`, the button will display a centered loading spinner instead of its contents.
    * The width of the button is not affected by the value of this prop.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.native
  /** Whether this button should use minimal styles. */
  var minimal: js.UndefOr[Boolean] = js.native
  /** Whether this button should use outlined styles. */
  var outlined: js.UndefOr[Boolean] = js.native
  /** Name of a Blueprint UI icon (or an icon element) to render after the text. */
  var rightIcon: js.UndefOr[IconName | MaybeElement] = js.native
  /** Whether this button should use small styles. */
  var small: js.UndefOr[Boolean] = js.native
  /**
    * HTML `type` attribute of button. Accepted values are `"button"`, `"submit"`, and `"reset"`.
    * Note that this prop has no effect on `AnchorButton`; it only affects `Button`.
    * @default "button"
    */
  var `type`: js.UndefOr[submit | reset | button] = js.native
}

object IButtonProps {
  @scala.inline
  def apply(): IButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonProps]
  }
  @scala.inline
  implicit class IButtonPropsOps[Self <: IButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignText(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignText")(js.undefined)
        ret
    }
    @scala.inline
    def withElementRef(value: /* ref */ HTMLElement | Null => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutElementRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlined")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightIcon(value: IconName | MaybeElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(null)
        ret
    }
    @scala.inline
    def withSmall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: submit | reset | button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

