package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Styles.MuiTheme
import typingsSlinky.materialDashUi.__MaterialUI.Styles.MuiThemeProviderProps
import typingsSlinky.materialDashUi.stylesMuiThemeProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MuiThemeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.stylesMuiThemeProviderMod.default].asInstanceOf[String | js.Object]
  def apply(muiTheme: MuiTheme = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (muiTheme != null) __obj.updateDynamic("muiTheme")(muiTheme.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MuiThemeProviderProps
}

