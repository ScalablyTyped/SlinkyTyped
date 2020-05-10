package typingsSlinky.reactNativeCalendars.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCalendars.reactNativeCalendarsStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class DotMarkingPropsOps[Self <: DotMarkingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkedDates(value: StringDictionary[DotMarking]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markedDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkingType(value: simple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markingType")(js.undefined)
        ret
    }
  }
  
}

