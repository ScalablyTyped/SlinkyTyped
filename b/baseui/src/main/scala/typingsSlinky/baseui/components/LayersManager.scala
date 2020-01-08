package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.layerMod.LayersManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LayersManager
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.layerMod.LayersManager] {
  @JSImport("baseui/layer", "LayersManager")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(zIndex: Int | Double = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.baseui.layerMod.LayersManager] = {
    val __obj = js.Dynamic.literal()
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.layerMod.LayersManager] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.layerMod.LayersManager](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LayersManagerProps
}

