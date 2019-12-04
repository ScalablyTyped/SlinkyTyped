package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Styles.MuiTheme
import typingsSlinky.materialDashUi.__MaterialUI.ThemeWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeWrapper
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.materialDashUi.__MaterialUI.ThemeWrapper] {
  @JSGlobal("__MaterialUI.ThemeWrapper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(theme: MuiTheme, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.materialDashUi.__MaterialUI.ThemeWrapper] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ThemeWrapperProps
}

