package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsControlPointStyleOptions extends js.Object {
  
  var fill: js.UndefOr[String] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var `stroke-width`: js.UndefOr[Double] = js.native
}
object AnnotationsControlPointStyleOptions {
  
  @scala.inline
  def apply(): AnnotationsControlPointStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsControlPointStyleOptions]
  }
  
  @scala.inline
  implicit class AnnotationsControlPointStyleOptionsOps[Self <: AnnotationsControlPointStyleOptions] (val x: Self) extends AnyVal {
    
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def `setStroke-width`(value: Double): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-width`: Self = this.set("stroke-width", js.undefined)
  }
}
