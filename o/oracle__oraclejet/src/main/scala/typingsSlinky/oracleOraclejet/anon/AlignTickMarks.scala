package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linear
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.log
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignTickMarks extends StObject {
  
  var alignTickMarks: off | on = js.native
  
  var axisLine: LineColorLineWidth = js.native
  
  var baselineScaling: min | zero = js.native
  
  var dataMax: Double = js.native
  
  var dataMin: Double = js.native
  
  var majorTick: BaselineColor = js.native
  
  var max: Double = js.native
  
  var maxSize: String = js.native
  
  var min: Double = js.native
  
  var minStep: Double = js.native
  
  var minorStep: Double = js.native
  
  var minorTick: LineStyle = js.native
  
  var position: start | end | top | bottom | auto = js.native
  
  var referenceObjects: js.Array[DisplayInLegend] = js.native
  
  var rendered: off | on = js.native
  
  var scale: log | linear = js.native
  
  var size: String = js.native
  
  var step: Double = js.native
  
  var tickLabel: Position = js.native
  
  var title: String = js.native
  
  var titleStyle: js.Object = js.native
}
object AlignTickMarks {
  
  @scala.inline
  def apply(
    alignTickMarks: off | on,
    axisLine: LineColorLineWidth,
    baselineScaling: min | zero,
    dataMax: Double,
    dataMin: Double,
    majorTick: BaselineColor,
    max: Double,
    maxSize: String,
    min: Double,
    minStep: Double,
    minorStep: Double,
    minorTick: LineStyle,
    position: start | end | top | bottom | auto,
    referenceObjects: js.Array[DisplayInLegend],
    rendered: off | on,
    scale: log | linear,
    size: String,
    step: Double,
    tickLabel: Position,
    title: String,
    titleStyle: js.Object
  ): AlignTickMarks = {
    val __obj = js.Dynamic.literal(alignTickMarks = alignTickMarks.asInstanceOf[js.Any], axisLine = axisLine.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], majorTick = majorTick.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minStep = minStep.asInstanceOf[js.Any], minorStep = minorStep.asInstanceOf[js.Any], minorTick = minorTick.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tickLabel = tickLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignTickMarks]
  }
  
  @scala.inline
  implicit class AlignTickMarksMutableBuilder[Self <: AlignTickMarks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignTickMarks(value: off | on): Self = StObject.set(x, "alignTickMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLine(value: LineColorLineWidth): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineScaling(value: min | zero): Self = StObject.set(x, "baselineScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMax(value: Double): Self = StObject.set(x, "dataMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMin(value: Double): Self = StObject.set(x, "dataMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTick(value: BaselineColor): Self = StObject.set(x, "majorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: String): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinStep(value: Double): Self = StObject.set(x, "minStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorStep(value: Double): Self = StObject.set(x, "minorStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTick(value: LineStyle): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: start | end | top | bottom | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceObjects(value: js.Array[DisplayInLegend]): Self = StObject.set(x, "referenceObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceObjectsVarargs(value: DisplayInLegend*): Self = StObject.set(x, "referenceObjects", js.Array(value :_*))
    
    @scala.inline
    def setRendered(value: off | on): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: log | linear): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLabel(value: Position): Self = StObject.set(x, "tickLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: js.Object): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
  }
}
