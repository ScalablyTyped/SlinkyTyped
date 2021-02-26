package typingsSlinky.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotMarkingProps extends _CalendarMarkingProps {
  
  var markedDates: StringDictionary[DotMarking] = js.native
  
  var markingType: js.UndefOr[simple] = js.native
}
object DotMarkingProps {
  
  @scala.inline
  def apply(markedDates: StringDictionary[DotMarking]): DotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotMarkingProps]
  }
  
  @scala.inline
  implicit class DotMarkingPropsMutableBuilder[Self <: DotMarkingProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarkedDates(value: StringDictionary[DotMarking]): Self = StObject.set(x, "markedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkingType(value: simple): Self = StObject.set(x, "markingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkingTypeUndefined: Self = StObject.set(x, "markingType", js.undefined)
  }
}
