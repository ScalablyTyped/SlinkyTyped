package typingsSlinky.reactNativeSvgCharts.mod

import slinky.core.ReactComponentClass
import typingsSlinky.d3Shape.mod.Series
import typingsSlinky.reactNativeSvg.mod.LinearGradientProps
import typingsSlinky.reactNativeSvg.mod.RadialGradientProps
import typingsSlinky.reactNativeSvgCharts.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackedAreaChartProps[T] extends ChartProps[T] {
  
  var colors: js.Array[String] = js.native
  
  var extras: js.UndefOr[js.Array[_]] = js.native
  
  var keys: js.Array[/* keyof T */ String] = js.native
  
  var offset: js.UndefOr[OffsetFunction] = js.native
  
  var order: js.UndefOr[OrderFunction] = js.native
  
  var renderDecorator: js.UndefOr[js.Function0[js.Object]] = js.native
  
  var renderGradient: js.UndefOr[
    js.Function1[
      /* props */ Color[T], 
      ReactComponentClass[LinearGradientProps | RadialGradientProps]
    ]
  ] = js.native
  
  var showGrid: js.UndefOr[Boolean] = js.native
}
object StackedAreaChartProps {
  
  @scala.inline
  def apply[T](colors: js.Array[String], data: js.Array[T], keys: js.Array[/* keyof T */ String]): StackedAreaChartProps[T] = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedAreaChartProps[T]]
  }
  
  @scala.inline
  implicit class StackedAreaChartPropsMutableBuilder[Self <: StackedAreaChartProps[_], T] (val x: Self with StackedAreaChartProps[T]) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setExtras(value: js.Array[_]): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    
    @scala.inline
    def setExtrasVarargs(value: js.Any*): Self = StObject.set(x, "extras", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: (/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double]) => Unit): Self = StObject.set(x, "offset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrder(value: /* series */ Series[js.Any, js.Any] => js.Array[Double]): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setRenderDecorator(value: () => js.Object): Self = StObject.set(x, "renderDecorator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderDecoratorUndefined: Self = StObject.set(x, "renderDecorator", js.undefined)
    
    @scala.inline
    def setRenderGradient(value: /* props */ Color[T] => ReactComponentClass[LinearGradientProps | RadialGradientProps]): Self = StObject.set(x, "renderGradient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderGradientUndefined: Self = StObject.set(x, "renderGradient", js.undefined)
    
    @scala.inline
    def setShowGrid(value: Boolean): Self = StObject.set(x, "showGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridUndefined: Self = StObject.set(x, "showGrid", js.undefined)
  }
}
