package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arcgisJsApi.esri.SymbolTableElement
  - typingsSlinky.arcgisJsApi.esri.ColorRampElement
  - typingsSlinky.arcgisJsApi.esri.OpacityRampElement
  - typingsSlinky.arcgisJsApi.esri.SizeRampElement
  - typingsSlinky.arcgisJsApi.esri.HeatmapRampElement
  - typingsSlinky.arcgisJsApi.esri.RelationshipRampElement
*/
trait LegendElement extends js.Object

object LegendElement {
  @scala.inline
  implicit def apply(value: ColorRampElement): LegendElement = value.asInstanceOf[LegendElement]
  @scala.inline
  implicit def apply(value: HeatmapRampElement): LegendElement = value.asInstanceOf[LegendElement]
  @scala.inline
  implicit def apply(value: OpacityRampElement): LegendElement = value.asInstanceOf[LegendElement]
  @scala.inline
  implicit def apply(value: RelationshipRampElement): LegendElement = value.asInstanceOf[LegendElement]
  @scala.inline
  implicit def apply(value: SizeRampElement): LegendElement = value.asInstanceOf[LegendElement]
  @scala.inline
  implicit def apply(value: SymbolTableElement): LegendElement = value.asInstanceOf[LegendElement]
}

