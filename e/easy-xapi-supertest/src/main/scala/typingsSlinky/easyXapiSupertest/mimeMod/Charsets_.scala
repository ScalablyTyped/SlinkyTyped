package typingsSlinky.easyXapiSupertest.mimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charsets_ extends js.Object {
  def lookup(mime: String): String = js.native
}

object Charsets_ {
  @scala.inline
  def apply(lookup: String => String): Charsets_ = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup))
    __obj.asInstanceOf[Charsets_]
  }
  @scala.inline
  implicit class Charsets_Ops[Self <: Charsets_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLookup(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

