package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcknowledgedDocs extends js.Object {
  var acknowledgedDocs: js.Array[String] = js.native
  var rejectedDocs: js.Array[String] = js.native
}

object AnonAcknowledgedDocs {
  @scala.inline
  def apply(acknowledgedDocs: js.Array[String], rejectedDocs: js.Array[String]): AnonAcknowledgedDocs = {
    val __obj = js.Dynamic.literal(acknowledgedDocs = acknowledgedDocs.asInstanceOf[js.Any], rejectedDocs = rejectedDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcknowledgedDocs]
  }
  @scala.inline
  implicit class AnonAcknowledgedDocsOps[Self <: AnonAcknowledgedDocs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcknowledgedDocs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledgedDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectedDocs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedDocs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

