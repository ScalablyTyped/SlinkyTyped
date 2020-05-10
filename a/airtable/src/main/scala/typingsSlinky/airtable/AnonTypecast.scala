package typingsSlinky.airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypecast extends js.Object {
  var typecast: Boolean = js.native
}

object AnonTypecast {
  @scala.inline
  def apply(typecast: Boolean): AnonTypecast = {
    val __obj = js.Dynamic.literal(typecast = typecast.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypecast]
  }
  @scala.inline
  implicit class AnonTypecastOps[Self <: AnonTypecast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypecast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typecast")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

