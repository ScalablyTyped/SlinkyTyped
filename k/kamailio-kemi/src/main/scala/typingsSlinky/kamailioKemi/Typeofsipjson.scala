package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsipjson extends js.Object {
  def sj_serialize(smode: String, pvn: String): Double = js.native
}

object Typeofsipjson {
  @scala.inline
  def apply(sj_serialize: (String, String) => Double): Typeofsipjson = {
    val __obj = js.Dynamic.literal(sj_serialize = js.Any.fromFunction2(sj_serialize))
    __obj.asInstanceOf[Typeofsipjson]
  }
  @scala.inline
  implicit class TypeofsipjsonOps[Self <: Typeofsipjson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSj_serialize(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sj_serialize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

