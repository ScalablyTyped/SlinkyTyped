package typingsSlinky.blueprintjsCore.iconMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconProps
  extends IIntentProps
     with IProps {
  /**
    * Color of icon. This is used as the `fill` attribute on the `<svg>` image
    * so it will override any CSS `color` property, including that set by
    * `intent`. If this prop is omitted, icon color is inherited from
    * surrounding text.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * String for the `title` attribute on the rendered element, which will appear
    * on hover as a native browser tooltip.
    */
  var htmlTitle: js.UndefOr[String] = js.native
  /**
    * Name of a Blueprint UI icon, or an icon element, to render. This prop is
    * required because it determines the content of the component, but it can
    * be explicitly set to falsy values to render nothing.
    *
    * - If `null` or `undefined` or `false`, this component will render
    *   nothing.
    * - If given an `IconName` (a string literal union of all icon names), that
    *   icon will be rendered as an `<svg>` with `<path>` tags. Unknown strings
    *   will render a blank icon to occupy space.
    * - If given a `JSX.Element`, that element will be rendered and _all other
    *   props on this component are ignored._ This type is supported to
    *   simplify icon support in other Blueprint components. As a consumer, you
    *   should avoid using `<Icon icon={<Element />}` directly; simply render
    *   `<Element />` instead.
    */
  var icon: IconName | MaybeElement = js.native
  /**
    * Size of the icon, in pixels. Blueprint contains 16px and 20px SVG icon
    * images, and chooses the appropriate resolution based on this prop.
    * @default Icon.SIZE_STANDARD = 16
    */
  var iconSize: js.UndefOr[Double] = js.native
  /** CSS style properties. */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * HTML tag to use for the rendered element.
    * @default "span"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  /**
    * Description string. This string does not appear in normal browsers, but
    * it increases accessibility. For instance, screen readers will use it for
    * aural feedback. By default, this is set to the icon's name. Pass an
    * explicit falsy value to disable.
    */
  var title: js.UndefOr[String | `false` | Null] = js.native
}

object IIconProps {
  @scala.inline
  def apply(): IIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIconProps]
  }
  @scala.inline
  implicit class IIconPropsOps[Self <: IIconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: IconName | MaybeElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withIconSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(js.undefined)
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
    @scala.inline
    def withTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

