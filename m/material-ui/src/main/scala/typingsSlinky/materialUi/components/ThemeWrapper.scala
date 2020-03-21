package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.Styles.MuiTheme
import typingsSlinky.materialUi.MaterialUI.ThemeWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeWrapper
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.materialUi.MaterialUI.ThemeWrapper] {
  @JSGlobal("__MaterialUI.ThemeWrapper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(theme: MuiTheme, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.materialUi.MaterialUI.ThemeWrapper] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ThemeWrapperProps
}

