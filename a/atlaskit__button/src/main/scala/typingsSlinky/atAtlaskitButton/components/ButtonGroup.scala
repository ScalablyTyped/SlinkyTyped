package typingsSlinky.atAtlaskitButton.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.ButtonAppearances
import typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.ButtonGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.ButtonGroup] {
  @JSImport("@atlaskit/button", "ButtonGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(appearance: ButtonAppearances = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atAtlaskitButton.atAtlaskitButtonMod.ButtonGroup] = {
    val __obj = js.Dynamic.literal()
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ButtonGroupProps
}

