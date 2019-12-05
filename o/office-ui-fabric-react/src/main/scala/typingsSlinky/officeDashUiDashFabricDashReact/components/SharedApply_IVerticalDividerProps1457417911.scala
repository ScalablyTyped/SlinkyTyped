package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDividerVerticalDividerDotTypesMod.IVerticalDividerClassNames
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDividerVerticalDividerDotTypesMod.IVerticalDividerProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDividerVerticalDividerDotTypesMod.IVerticalDividerPropsStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDividerVerticalDividerDotTypesMod.IVerticalDividerStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IVerticalDividerProps1457417911 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  /* The following DOM/SVG props were specified: className */
  def apply(
    getClassNames: /* theme */ ITheme => IVerticalDividerClassNames = null,
    styles: IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction1(getClassNames))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IVerticalDividerProps
}

