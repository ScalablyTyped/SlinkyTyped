package typingsSlinky.reactFrontload.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactFrontload.mod.FrontloadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Frontload
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactFrontload.mod.Frontload] {
  @JSImport("react-frontload", "Frontload")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(noServerRender: js.UndefOr[Boolean] = js.undefined, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactFrontload.mod.Frontload] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noServerRender)) __obj.updateDynamic("noServerRender")(noServerRender.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactFrontload.mod.Frontload] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactFrontload.mod.Frontload](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FrontloadProps
}

