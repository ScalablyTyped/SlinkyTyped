package typingsSlinky.ejWebAll.ej.datavisualization.HeatMapLegend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorMappingCollection extends js.Object {
  
  /** Specifies the color of the heatmap legend data.
    * @Default {white}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specifies the label properties of the heatmap legend color.
    * @Default {null}
    */
  var label: js.UndefOr[ColorMappingCollectionLabel] = js.native
  
  /** Specifies the color values of the heatmap legend column data.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
}
object ColorMappingCollection {
  
  @scala.inline
  def apply(): ColorMappingCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMappingCollection]
  }
  
  @scala.inline
  implicit class ColorMappingCollectionOps[Self <: ColorMappingCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setLabel(value: ColorMappingCollectionLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
