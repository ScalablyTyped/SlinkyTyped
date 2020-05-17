package typingsSlinky.officeUiFabricReact.baseButtonClassNamesMod

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Button/BaseButton.classNames", "getBaseButtonClassNames")
@js.native
object getBaseButtonClassNames extends js.Object {
  def apply(
    theme: ITheme,
    styles: IButtonStyles,
    className: String,
    variantClassName: String,
    iconClassName: js.UndefOr[String],
    menuIconClassName: js.UndefOr[String],
    disabled: Boolean,
    hasMenu: Boolean,
    checked: Boolean,
    expanded: Boolean
  ): IButtonClassNames = js.native
  def apply(
    theme: ITheme,
    styles: IButtonStyles,
    className: String,
    variantClassName: String,
    iconClassName: js.UndefOr[String],
    menuIconClassName: js.UndefOr[String],
    disabled: Boolean,
    hasMenu: Boolean,
    checked: Boolean,
    expanded: Boolean,
    isSplit: Boolean
  ): IButtonClassNames = js.native
}

