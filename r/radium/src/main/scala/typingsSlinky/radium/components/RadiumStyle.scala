package typingsSlinky.radium.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.radium.radiumMod.Radium.StyleProps
import typingsSlinky.radium.radiumMod.Radium.StyleRules
import typingsSlinky.radium.radiumMod.default.Style
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadiumStyle
  extends ExternalComponentWithAttributesWithRefType[tag.type, Style] {
  @JSImport("radium", "default.Style")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    rules: CSSProperties | StyleRules,
    scopeSelector: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Style] = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    if (scopeSelector != null) __obj.updateDynamic("scopeSelector")(scopeSelector.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StyleProps
}

