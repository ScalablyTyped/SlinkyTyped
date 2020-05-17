package typingsSlinky.activexPowerpoint.anon

import typingsSlinky.activexPowerpoint.PowerPoint.DocumentWindow
import typingsSlinky.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresWn extends js.Object {
  val Pres: Presentation = js.native
  val Wn: DocumentWindow = js.native
}

object PresWn {
  @scala.inline
  def apply(Pres: Presentation, Wn: DocumentWindow): PresWn = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresWn]
  }
  @scala.inline
  implicit class PresWnOps[Self <: PresWn] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withWn(value: DocumentWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

