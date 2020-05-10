package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMessageSet extends js.Object {
  var recordMessageSetExt: js.UndefOr[SchemaLivegraphBacktraceRecordInfo] = js.native
}

object SchemaMessageSet {
  @scala.inline
  def apply(): SchemaMessageSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageSet]
  }
  @scala.inline
  implicit class SchemaMessageSetOps[Self <: SchemaMessageSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordMessageSetExt(value: SchemaLivegraphBacktraceRecordInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordMessageSetExt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordMessageSetExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordMessageSetExt")(js.undefined)
        ret
    }
  }
  
}

