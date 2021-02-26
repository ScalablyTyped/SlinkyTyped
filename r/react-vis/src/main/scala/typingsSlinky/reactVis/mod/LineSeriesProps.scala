package typingsSlinky.reactVis.mod

import typingsSlinky.reactVis.reactVisStrings.dashed
import typingsSlinky.reactVis.reactVisStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSeriesProps extends AbstractSeriesProps[LineSeriesPoint] {
  
  // default: 'solid'
  var curve: js.UndefOr[String | (js.Function1[/* x */ js.Any, _])] = js.native
  
  // default: null
  var getNull: js.UndefOr[RVGetNull[LineSeriesPoint]] = js.native
  
  var strokeStyle: js.UndefOr[dashed | solid] = js.native
}
object LineSeriesProps {
  
  @scala.inline
  def apply(): LineSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSeriesProps]
  }
  
  @scala.inline
  implicit class LineSeriesPropsMutableBuilder[Self <: LineSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: String | (js.Function1[/* x */ js.Any, _])): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveFunction1(value: /* x */ js.Any => _): Self = StObject.set(x, "curve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    @scala.inline
    def setGetNull(value: LineSeriesPoint => js.Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: dashed | solid): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
  }
}
