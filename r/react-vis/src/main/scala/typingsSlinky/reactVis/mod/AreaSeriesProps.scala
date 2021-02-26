package typingsSlinky.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaSeriesProps extends AbstractSeriesProps[AreaSeriesPoint] {
  
  var getNull: js.UndefOr[RVGetNull[AreaSeriesPoint]] = js.native
}
object AreaSeriesProps {
  
  @scala.inline
  def apply(): AreaSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaSeriesProps]
  }
  
  @scala.inline
  implicit class AreaSeriesPropsMutableBuilder[Self <: AreaSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNull(value: AreaSeriesPoint => js.Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
  }
}
