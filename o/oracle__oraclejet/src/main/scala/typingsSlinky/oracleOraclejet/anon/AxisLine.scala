package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linear
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.log
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisLine extends StObject {
  
  var axisLine: LineWidth = js.native
  
  var baselineScaling: min | zero = js.native
  
  var dataMax: Double = js.native
  
  var dataMin: Double = js.native
  
  var majorTick: BaselineColor = js.native
  
  var max: Double | String = js.native
  
  var maxSize: String = js.native
  
  var min: Double | String = js.native
  
  var minStep: Double = js.native
  
  var minorStep: Double = js.native
  
  var minorTick: LineStyle = js.native
  
  var referenceObjects: js.Array[Categories] = js.native
  
  var rendered: off | on = js.native
  
  var scale: log | linear = js.native
  
  var size: String = js.native
  
  var step: Double = js.native
  
  var tickLabel: Rotation = js.native
  
  var title: String = js.native
  
  var titleStyle: js.Object = js.native
  
  var viewportEndGroup: Double | String = js.native
  
  var viewportMax: Double | String = js.native
  
  var viewportMin: Double | String = js.native
  
  var viewportStartGroup: Double | String = js.native
}
object AxisLine {
  
  @scala.inline
  def apply(
    axisLine: LineWidth,
    baselineScaling: min | zero,
    dataMax: Double,
    dataMin: Double,
    majorTick: BaselineColor,
    max: Double | String,
    maxSize: String,
    min: Double | String,
    minStep: Double,
    minorStep: Double,
    minorTick: LineStyle,
    referenceObjects: js.Array[Categories],
    rendered: off | on,
    scale: log | linear,
    size: String,
    step: Double,
    tickLabel: Rotation,
    title: String,
    titleStyle: js.Object,
    viewportEndGroup: Double | String,
    viewportMax: Double | String,
    viewportMin: Double | String,
    viewportStartGroup: Double | String
  ): AxisLine = {
    val __obj = js.Dynamic.literal(axisLine = axisLine.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], majorTick = majorTick.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minStep = minStep.asInstanceOf[js.Any], minorStep = minorStep.asInstanceOf[js.Any], minorTick = minorTick.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tickLabel = tickLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any], viewportEndGroup = viewportEndGroup.asInstanceOf[js.Any], viewportMax = viewportMax.asInstanceOf[js.Any], viewportMin = viewportMin.asInstanceOf[js.Any], viewportStartGroup = viewportStartGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLine]
  }
  
  @scala.inline
  implicit class AxisLineMutableBuilder[Self <: AxisLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisLine(value: LineWidth): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineScaling(value: min | zero): Self = StObject.set(x, "baselineScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMax(value: Double): Self = StObject.set(x, "dataMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMin(value: Double): Self = StObject.set(x, "dataMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTick(value: BaselineColor): Self = StObject.set(x, "majorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: String): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinStep(value: Double): Self = StObject.set(x, "minStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorStep(value: Double): Self = StObject.set(x, "minorStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTick(value: LineStyle): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceObjects(value: js.Array[Categories]): Self = StObject.set(x, "referenceObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceObjectsVarargs(value: Categories*): Self = StObject.set(x, "referenceObjects", js.Array(value :_*))
    
    @scala.inline
    def setRendered(value: off | on): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: log | linear): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLabel(value: Rotation): Self = StObject.set(x, "tickLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: js.Object): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportEndGroup(value: Double | String): Self = StObject.set(x, "viewportEndGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportMax(value: Double | String): Self = StObject.set(x, "viewportMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportMin(value: Double | String): Self = StObject.set(x, "viewportMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportStartGroup(value: Double | String): Self = StObject.set(x, "viewportStartGroup", value.asInstanceOf[js.Any])
  }
}
