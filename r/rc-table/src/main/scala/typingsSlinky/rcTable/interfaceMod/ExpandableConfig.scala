package typingsSlinky.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandableConfig[RecordType] extends LegacyExpandableProps[RecordType] {
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.native
}

object ExpandableConfig {
  @scala.inline
  def apply[RecordType](): ExpandableConfig[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandableConfig[RecordType]]
  }
  @scala.inline
  implicit class ExpandableConfigOps[Self[recordtype] <: ExpandableConfig[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withRowExpandable(value: /* record */ RecordType => Boolean): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpandable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowExpandable: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowExpandable")(js.undefined)
        ret
    }
  }
  
}

