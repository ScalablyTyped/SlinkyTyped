package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTech extends js.Object {
  var tech: String = js.native
}

object AnonTech {
  @scala.inline
  def apply(tech: String): AnonTech = {
    val __obj = js.Dynamic.literal(tech = tech.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTech]
  }
  @scala.inline
  implicit class AnonTechOps[Self <: AnonTech] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tech")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

