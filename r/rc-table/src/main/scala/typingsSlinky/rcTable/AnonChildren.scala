package typingsSlinky.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren[RecordType /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  children ? :std.Array<RecordType>} */ js.Any */] extends js.Object {
  var children: js.UndefOr[js.Array[RecordType]] = js.native
}

object AnonChildren {
  @scala.inline
  def apply[RecordType](): AnonChildren[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChildren[RecordType]]
  }
  @scala.inline
  implicit class AnonChildrenOps[Self[recordtype] <: AnonChildren[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withChildren(value: js.Array[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

