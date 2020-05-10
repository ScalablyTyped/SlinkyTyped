package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath._XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPfCancel extends js.Object {
  val pDocument: _XDocument = js.native
  var pfCancel: Boolean = js.native
}

object AnonPfCancel {
  @scala.inline
  def apply(pDocument: _XDocument, pfCancel: Boolean): AnonPfCancel = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any], pfCancel = pfCancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPfCancel]
  }
  @scala.inline
  implicit class AnonPfCancelOps[Self <: AnonPfCancel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPDocument(value: _XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPfCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfCancel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

