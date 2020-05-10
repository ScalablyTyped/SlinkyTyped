package typingsSlinky.activexPowerpoint

import typingsSlinky.activexPowerpoint.PowerPoint.Slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSld extends js.Object {
  val Sld: Slide = js.native
}

object AnonSld {
  @scala.inline
  def apply(Sld: Slide): AnonSld = {
    val __obj = js.Dynamic.literal(Sld = Sld.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSld]
  }
  @scala.inline
  implicit class AnonSldOps[Self <: AnonSld] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSld(value: Slide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sld")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

