package typingsSlinky.rcTable.anon

import typingsSlinky.rcTable.interfaceMod.ExpandableConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expandable[RecordType] extends js.Object {
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.native
}

object Expandable {
  @scala.inline
  def apply[RecordType](): Expandable[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expandable[RecordType]]
  }
  @scala.inline
  implicit class ExpandableOps[Self[recordtype] <: Expandable[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withExpandable(value: ExpandableConfig[RecordType]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandable: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(js.undefined)
        ret
    }
  }
  
}

