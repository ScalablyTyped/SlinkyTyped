package typingsSlinky.parse

import typingsSlinky.parse.mod._Global_.Parse.Object._Encode
import typingsSlinky.parse.parseStrings.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIso
  extends _Encode[js.Any] {
  var __type: Date = js.native
  var iso: String = js.native
}

object AnonIso {
  @scala.inline
  def apply(__type: Date, iso: String): AnonIso = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIso]
  }
  @scala.inline
  implicit class AnonIsoOps[Self <: AnonIso] (val x: Self) extends AnyVal {
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

