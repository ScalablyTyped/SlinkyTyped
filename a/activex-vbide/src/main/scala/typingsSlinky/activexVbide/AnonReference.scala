package typingsSlinky.activexVbide

import typingsSlinky.activexVbide.VBIDE.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReference extends js.Object {
  val Reference: typingsSlinky.activexVbide.VBIDE.Reference = js.native
}

object AnonReference {
  @scala.inline
  def apply(Reference: Reference): AnonReference = {
    val __obj = js.Dynamic.literal(Reference = Reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReference]
  }
  @scala.inline
  implicit class AnonReferenceOps[Self <: AnonReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

