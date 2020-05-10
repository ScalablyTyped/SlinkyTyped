package typingsSlinky.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNames extends js.Object {
  var names: js.Array[String] = js.native
  var namesAbbr: js.Array[String] = js.native
  var namesShort: js.Array[String] = js.native
}

object AnonNames {
  @scala.inline
  def apply(names: js.Array[String], namesAbbr: js.Array[String], namesShort: js.Array[String]): AnonNames = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], namesAbbr = namesAbbr.asInstanceOf[js.Any], namesShort = namesShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNames]
  }
  @scala.inline
  implicit class AnonNamesOps[Self <: AnonNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamesAbbr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namesAbbr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namesShort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

