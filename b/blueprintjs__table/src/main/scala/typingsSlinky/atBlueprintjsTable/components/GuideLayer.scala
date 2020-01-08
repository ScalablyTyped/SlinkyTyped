package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsTable.libEsmLayersGuidesMod.IGuideLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideLayer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsTable.libEsmLayersGuidesMod.GuideLayer] {
  @JSImport("@blueprintjs/table/lib/esm/layers/guides", "GuideLayer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    horizontalGuides: js.Array[Double] = null,
    verticalGuides: js.Array[Double] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.libEsmLayersGuidesMod.GuideLayer] = {
    val __obj = js.Dynamic.literal()
    if (horizontalGuides != null) __obj.updateDynamic("horizontalGuides")(horizontalGuides.asInstanceOf[js.Any])
    if (verticalGuides != null) __obj.updateDynamic("verticalGuides")(verticalGuides.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.libEsmLayersGuidesMod.GuideLayer] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBlueprintjsTable.libEsmLayersGuidesMod.GuideLayer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IGuideLayerProps
}

