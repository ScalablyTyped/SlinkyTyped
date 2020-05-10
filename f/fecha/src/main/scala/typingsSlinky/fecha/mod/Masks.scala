package typingsSlinky.fecha.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Masks extends /* myMask */ StringDictionary[String] {
  var default: String = js.native
  var fullDate: String = js.native
  var longDate: String = js.native
  var longTime: String = js.native
  var mediumDate: String = js.native
  var mediumTime: String = js.native
  var shortDate: String = js.native
  var shortTime: String = js.native
}

object Masks {
  @scala.inline
  def apply(
    default: String,
    fullDate: String,
    longDate: String,
    longTime: String,
    mediumDate: String,
    mediumTime: String,
    shortDate: String,
    shortTime: String
  ): Masks = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], mediumDate = mediumDate.asInstanceOf[js.Any], mediumTime = mediumTime.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Masks]
  }
  @scala.inline
  implicit class MasksOps[Self <: Masks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediumDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediumTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

