package typingsSlinky.reactDates.anon

import slinky.core.facade.ReactElement
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactDates.mod.RenderMonthProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderMonthElement extends RenderMonthProps {
  
  var renderMonthElement: js.UndefOr[scala.Nothing] = js.native
  
  var renderMonthText: js.UndefOr[(js.Function1[/* month */ Moment, ReactElement]) | Null] = js.native
}
object RenderMonthElement {
  
  @scala.inline
  def apply(): RenderMonthElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderMonthElement]
  }
  
  @scala.inline
  implicit class RenderMonthElementMutableBuilder[Self <: RenderMonthElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderMonthText(value: /* month */ Moment => ReactElement): Self = StObject.set(x, "renderMonthText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderMonthTextNull: Self = StObject.set(x, "renderMonthText", null)
    
    @scala.inline
    def setRenderMonthTextUndefined: Self = StObject.set(x, "renderMonthText", js.undefined)
  }
}
