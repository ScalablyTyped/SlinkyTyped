package typingsSlinky.reactDashFlagDashIconDashCss.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFlagDashIconDashCss.reactDashFlagDashIconDashCssMod.FlagIconFlip
import typingsSlinky.reactDashFlagDashIconDashCss.reactDashFlagDashIconDashCssMod.FlagIconProps
import typingsSlinky.reactDashFlagDashIconDashCss.reactDashFlagDashIconDashCssMod.FlagIconRotate
import typingsSlinky.reactDashFlagDashIconDashCss.reactDashFlagDashIconDashCssMod.FlagIconSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FlagIcon
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashFlagDashIconDashCss.reactDashFlagDashIconDashCssMod.FlagIcon
    ] {
  @JSImport("react-flag-icon-css", "FlagIcon")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    code: String,
    Component: String = null,
    flip: FlagIconFlip = null,
    rotate: FlagIconRotate = null,
    size: FlagIconSize = null,
    squared: js.UndefOr[Boolean] = js.undefined,
    styleName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashFlagDashIconDashCss.reactDashFlagDashIconDashCssMod.FlagIcon
  ] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(squared)) __obj.updateDynamic("squared")(squared.asInstanceOf[js.Any])
    if (styleName != null) __obj.updateDynamic("styleName")(styleName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FlagIconProps
}

