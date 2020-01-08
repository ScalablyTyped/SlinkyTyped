package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsTable.libEsmLayersRegionsMod.IRegionLayerProps
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RegionLayer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsTable.libEsmLayersRegionsMod.RegionLayer] {
  @JSImport("@blueprintjs/table/lib/esm/layers/regions", "RegionLayer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    regionStyles: js.Array[CSSProperties] = null,
    regions: js.Array[IRegion] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.libEsmLayersRegionsMod.RegionLayer] = {
    val __obj = js.Dynamic.literal()
    if (regionStyles != null) __obj.updateDynamic("regionStyles")(regionStyles.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsTable.libEsmLayersRegionsMod.RegionLayer] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atBlueprintjsTable.libEsmLayersRegionsMod.RegionLayer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IRegionLayerProps
}

