package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartCommonAnnotationConfig extends BaseChartAnnotationConfig {
  
  /** @name dxPolarChartCommonAnnotationConfig.angle */
  var angle: js.UndefOr[Double] = js.native
  
  /** @name dxPolarChartCommonAnnotationConfig.radius */
  var radius: js.UndefOr[Double] = js.native
}
object dxPolarChartCommonAnnotationConfig {
  
  @scala.inline
  def apply(): dxPolarChartCommonAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAnnotationConfig]
  }
  
  @scala.inline
  implicit class dxPolarChartCommonAnnotationConfigOps[Self <: dxPolarChartCommonAnnotationConfig] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
}
