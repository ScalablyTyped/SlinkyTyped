package typingsSlinky.lightpick.mod.Options.Locale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralizeFnLocale extends js.Object {
  var one: String = js.native
  var other: String = js.native
}

object PluralizeFnLocale {
  @scala.inline
  def apply(one: String, other: String): PluralizeFnLocale = {
    val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralizeFnLocale]
  }
  @scala.inline
  implicit class PluralizeFnLocaleOps[Self <: PluralizeFnLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

