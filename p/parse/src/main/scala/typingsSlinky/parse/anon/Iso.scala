package typingsSlinky.parse.anon

import typingsSlinky.parse.mod.global.Parse.Object.Encode
import typingsSlinky.parse.parseStrings.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iso
  extends Encode[js.Any] {
  var __type: Date = js.native
  var iso: String = js.native
}

object Iso {
  @scala.inline
  def apply(__type: Date, iso: String): Iso = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iso]
  }
  @scala.inline
  implicit class IsoOps[Self <: Iso] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__type(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

