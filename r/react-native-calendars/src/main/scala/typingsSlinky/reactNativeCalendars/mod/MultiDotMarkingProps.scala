package typingsSlinky.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.`multi-dot`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiDotMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[MultiDotMarking] = js.native
  var markingType: `multi-dot` = js.native
}

object MultiDotMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[MultiDotMarking], markingType: `multi-dot`): MultiDotMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiDotMarkingProps]
  }
  @scala.inline
  implicit class MultiDotMarkingPropsOps[Self <: MultiDotMarkingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkedDates(value: StringDictionary[MultiDotMarking]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markedDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkingType(value: `multi-dot`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markingType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

