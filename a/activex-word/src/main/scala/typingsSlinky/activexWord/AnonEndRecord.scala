package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndRecord extends js.Object {
  var Cancel: Boolean = js.native
  val Doc: Document = js.native
  val EndRecord: Double = js.native
  val StartRecord: Double = js.native
}

object AnonEndRecord {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, EndRecord: Double, StartRecord: Double): AnonEndRecord = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], EndRecord = EndRecord.asInstanceOf[js.Any], StartRecord = StartRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndRecord]
  }
  @scala.inline
  implicit class AnonEndRecordOps[Self <: AnonEndRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoc(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndRecord(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartRecord(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartRecord")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

