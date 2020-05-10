package typingsSlinky.reactBigCalendar.mod

import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateLocalizerSpec extends js.Object {
  var formats: Formats = js.native
  var propType: js.UndefOr[Validator[_]] = js.native
  def firstOfWeek(culture: Culture): Double = js.native
  def format(value: FormatInput, format: String, culture: Culture): String = js.native
}

object DateLocalizerSpec {
  @scala.inline
  def apply(firstOfWeek: Culture => Double, format: (FormatInput, String, Culture) => String, formats: Formats): DateLocalizerSpec = {
    val __obj = js.Dynamic.literal(firstOfWeek = js.Any.fromFunction1(firstOfWeek), format = js.Any.fromFunction3(format), formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateLocalizerSpec]
  }
  @scala.inline
  implicit class DateLocalizerSpecOps[Self <: DateLocalizerSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstOfWeek(value: Culture => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstOfWeek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: (FormatInput, String, Culture) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFormats(value: Formats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropType(value: Validator[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propType")(js.undefined)
        ret
    }
  }
  
}

