package typingsSlinky.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonAxe extends StObject {
  
  var afterBuildTicks: js.UndefOr[js.Function2[/* scale */ js.Any, /* ticks */ js.Array[Double], js.Array[Double]]] = js.native
  
  var afterCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var afterUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeBuildTicks: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.native
  
  var bounds: js.UndefOr[String] = js.native
  
  var display: js.UndefOr[Boolean | String] = js.native
  
  var gridLines: js.UndefOr[GridLineOptions] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[js.Array[String]] = js.native
  
  var offset: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var scaleLabel: js.UndefOr[ScaleTitleOptions] = js.native
  
  var stacked: js.UndefOr[Boolean] = js.native
  
  var ticks: js.UndefOr[TickOptions] = js.native
  
  var time: js.UndefOr[TimeScale] = js.native
  
  var `type`: js.UndefOr[ScaleType | String] = js.native
}
object CommonAxe {
  
  @scala.inline
  def apply(): CommonAxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonAxe]
  }
  
  @scala.inline
  implicit class CommonAxeMutableBuilder[Self <: CommonAxe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterBuildTicks(value: (/* scale */ js.Any, /* ticks */ js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterBuildTicksUndefined: Self = StObject.set(x, "afterBuildTicks", js.undefined)
    
    @scala.inline
    def setAfterCalculateTickRotation(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterCalculateTickRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterCalculateTickRotationUndefined: Self = StObject.set(x, "afterCalculateTickRotation", js.undefined)
    
    @scala.inline
    def setAfterDataLimits(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterDataLimitsUndefined: Self = StObject.set(x, "afterDataLimits", js.undefined)
    
    @scala.inline
    def setAfterFit(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterFit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterFitUndefined: Self = StObject.set(x, "afterFit", js.undefined)
    
    @scala.inline
    def setAfterSetDimension(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterSetDimension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterSetDimensionUndefined: Self = StObject.set(x, "afterSetDimension", js.undefined)
    
    @scala.inline
    def setAfterTickToLabelConversion(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterTickToLabelConversionUndefined: Self = StObject.set(x, "afterTickToLabelConversion", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    @scala.inline
    def setBeforeBuildTicks(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeBuildTicksUndefined: Self = StObject.set(x, "beforeBuildTicks", js.undefined)
    
    @scala.inline
    def setBeforeCalculateTickRotation(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeCalculateTickRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeCalculateTickRotationUndefined: Self = StObject.set(x, "beforeCalculateTickRotation", js.undefined)
    
    @scala.inline
    def setBeforeDataLimits(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeDataLimitsUndefined: Self = StObject.set(x, "beforeDataLimits", js.undefined)
    
    @scala.inline
    def setBeforeFit(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeFitUndefined: Self = StObject.set(x, "beforeFit", js.undefined)
    
    @scala.inline
    def setBeforeSetDimension(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeSetDimension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeSetDimensionUndefined: Self = StObject.set(x, "beforeSetDimension", js.undefined)
    
    @scala.inline
    def setBeforeTickToLabelConversion(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeTickToLabelConversionUndefined: Self = StObject.set(x, "beforeTickToLabelConversion", js.undefined)
    
    @scala.inline
    def setBeforeUpdate(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    @scala.inline
    def setBounds(value: String): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setDisplay(value: Boolean | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setGridLines(value: GridLineOptions): Self = StObject.set(x, "gridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridLinesUndefined: Self = StObject.set(x, "gridLines", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setScaleLabel(value: ScaleTitleOptions): Self = StObject.set(x, "scaleLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleLabelUndefined: Self = StObject.set(x, "scaleLabel", js.undefined)
    
    @scala.inline
    def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    @scala.inline
    def setTicks(value: TickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTime(value: TimeScale): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setType(value: ScaleType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
