package typingsSlinky.reactDates.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticTransitionEvent
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactDates.mod.ModifiersShape
import typingsSlinky.reactDates.mod.ScrollableOrientationShape
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstVisibleMonthIndex extends StObject {
  
  var firstVisibleMonthIndex: js.UndefOr[Double] = js.native
  
  var initialMonth: js.UndefOr[Moment] = js.native
  
  var isAnimating: js.UndefOr[Boolean] = js.native
  
  var isRTL: js.UndefOr[Boolean] = js.native
  
  var modifiers: js.UndefOr[Record[String, Record[String, ModifiersShape]]] = js.native
  
  var numberOfMonths: js.UndefOr[Double] = js.native
  
  var onMonthChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.native
  
  var onMonthTransitionEnd: js.UndefOr[
    js.Function1[/* event */ js.UndefOr[SyntheticTransitionEvent[HTMLDivElement]], Unit]
  ] = js.native
  
  var onYearChange: js.UndefOr[js.Function1[/* newMonth */ Moment, Unit]] = js.native
  
  var orientation: js.UndefOr[ScrollableOrientationShape] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
  
  var translationValue: js.UndefOr[Double | Null] = js.native
}
object FirstVisibleMonthIndex {
  
  @scala.inline
  def apply(): FirstVisibleMonthIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstVisibleMonthIndex]
  }
  
  @scala.inline
  implicit class FirstVisibleMonthIndexMutableBuilder[Self <: FirstVisibleMonthIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstVisibleMonthIndex(value: Double): Self = StObject.set(x, "firstVisibleMonthIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstVisibleMonthIndexUndefined: Self = StObject.set(x, "firstVisibleMonthIndex", js.undefined)
    
    @scala.inline
    def setInitialMonth(value: Moment): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
    
    @scala.inline
    def setIsAnimating(value: Boolean): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAnimatingUndefined: Self = StObject.set(x, "isAnimating", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    @scala.inline
    def setModifiers(value: Record[String, Record[String, ModifiersShape]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
    
    @scala.inline
    def setOnMonthChange(value: /* newMonth */ Moment => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    @scala.inline
    def setOnMonthTransitionEnd(value: /* event */ js.UndefOr[SyntheticTransitionEvent[HTMLDivElement]] => Unit): Self = StObject.set(x, "onMonthTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMonthTransitionEndUndefined: Self = StObject.set(x, "onMonthTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnYearChange(value: /* newMonth */ Moment => Unit): Self = StObject.set(x, "onYearChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnYearChangeUndefined: Self = StObject.set(x, "onYearChange", js.undefined)
    
    @scala.inline
    def setOrientation(value: ScrollableOrientationShape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTranslationValue(value: Double): Self = StObject.set(x, "translationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationValueNull: Self = StObject.set(x, "translationValue", null)
    
    @scala.inline
    def setTranslationValueUndefined: Self = StObject.set(x, "translationValue", js.undefined)
  }
}
