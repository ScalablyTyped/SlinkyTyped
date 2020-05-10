package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMohClassString extends js.Object {
  var mohClass: js.UndefOr[String] = js.native
}

object AnonMohClassString {
  @scala.inline
  def apply(): AnonMohClassString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMohClassString]
  }
  @scala.inline
  implicit class AnonMohClassStringOps[Self <: AnonMohClassString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMohClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mohClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMohClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mohClass")(js.undefined)
        ret
    }
  }
  
}

