package typingsSlinky.activexOffice

import typingsSlinky.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOldPart extends js.Object {
  val OldPart: CustomXMLPart = js.native
}

object AnonOldPart {
  @scala.inline
  def apply(OldPart: CustomXMLPart): AnonOldPart = {
    val __obj = js.Dynamic.literal(OldPart = OldPart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldPart]
  }
  @scala.inline
  implicit class AnonOldPartOps[Self <: AnonOldPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldPart(value: CustomXMLPart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OldPart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

