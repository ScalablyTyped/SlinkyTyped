package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLivegraphBacktraceRecordInfoExpInfo extends js.Object {
  var deletedIns: js.UndefOr[js.Array[String]] = js.native
}

object SchemaLivegraphBacktraceRecordInfoExpInfo {
  @scala.inline
  def apply(): SchemaLivegraphBacktraceRecordInfoExpInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivegraphBacktraceRecordInfoExpInfo]
  }
  @scala.inline
  implicit class SchemaLivegraphBacktraceRecordInfoExpInfoOps[Self <: SchemaLivegraphBacktraceRecordInfoExpInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedIns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedIns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedIns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedIns")(js.undefined)
        ret
    }
  }
  
}

