package typingsSlinky.activexPowerpoint

import typingsSlinky.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPres extends js.Object {
  val Pres: Presentation = js.native
}

object AnonPres {
  @scala.inline
  def apply(Pres: Presentation): AnonPres = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPres]
  }
  @scala.inline
  implicit class AnonPresOps[Self <: AnonPres] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPres(value: Presentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pres")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

