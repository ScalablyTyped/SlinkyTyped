package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.circle
import typingsSlinky.devextreme.devextremeStrings.rangeBar
import typingsSlinky.devextreme.devextremeStrings.rectangle
import typingsSlinky.devextreme.devextremeStrings.rectangleNeedle
import typingsSlinky.devextreme.devextremeStrings.rhombus
import typingsSlinky.devextreme.devextremeStrings.textCloud
import typingsSlinky.devextreme.devextremeStrings.triangleMarker
import typingsSlinky.devextreme.devextremeStrings.triangleNeedle
import typingsSlinky.devextreme.devextremeStrings.twoColorNeedle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GaugeIndicator extends CommonIndicator {
  
  /**
    * [descr:GaugeIndicator.type]
    */
  var `type`: js.UndefOr[
    circle | rangeBar | rectangle | rectangleNeedle | rhombus | textCloud | triangleMarker | triangleNeedle | twoColorNeedle
  ] = js.native
}
object GaugeIndicator {
  
  @scala.inline
  def apply(): GaugeIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeIndicator]
  }
  
  @scala.inline
  implicit class GaugeIndicatorOps[Self <: GaugeIndicator] (val x: Self) extends AnyVal {
    
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
    def setType(
      value: circle | rangeBar | rectangle | rectangleNeedle | rhombus | textCloud | triangleMarker | triangleNeedle | twoColorNeedle
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
