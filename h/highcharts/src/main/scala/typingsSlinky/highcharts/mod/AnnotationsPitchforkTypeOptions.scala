package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationsPitchforkTypeOptions extends js.Object {
  
  /**
    * (Highstock) Inner background options.
    */
  var innerBackground: js.UndefOr[AnnotationsPitchforkTypeInnerBackgroundOptions] = js.native
  
  /**
    * (Highstock) Line options.
    */
  var line: js.UndefOr[AnnotationsPitchforkTypeLineOptions] = js.native
  
  /**
    * (Highstock) Outer background options.
    */
  var outerBackground: js.UndefOr[AnnotationsPitchforkTypeOuterBackgroundOptions] = js.native
  
  var points: js.UndefOr[js.Array[AnnotationsPitchforkTypePointsOptions]] = js.native
  
  /**
    * (Highstock) This number defines which xAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var xAxis: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) This number defines which yAxis the point is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array.
    */
  var yAxis: js.UndefOr[Double] = js.native
}
object AnnotationsPitchforkTypeOptions {
  
  @scala.inline
  def apply(): AnnotationsPitchforkTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsPitchforkTypeOptions]
  }
  
  @scala.inline
  implicit class AnnotationsPitchforkTypeOptionsOps[Self <: AnnotationsPitchforkTypeOptions] (val x: Self) extends AnyVal {
    
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
    def setInnerBackground(value: AnnotationsPitchforkTypeInnerBackgroundOptions): Self = this.set("innerBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerBackground: Self = this.set("innerBackground", js.undefined)
    
    @scala.inline
    def setLine(value: AnnotationsPitchforkTypeLineOptions): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setOuterBackground(value: AnnotationsPitchforkTypeOuterBackgroundOptions): Self = this.set("outerBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterBackground: Self = this.set("outerBackground", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: AnnotationsPitchforkTypePointsOptions*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[AnnotationsPitchforkTypePointsOptions]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setXAxis(value: Double): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    
    @scala.inline
    def setYAxis(value: Double): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
}
