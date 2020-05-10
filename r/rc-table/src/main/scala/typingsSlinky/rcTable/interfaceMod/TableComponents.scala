package typingsSlinky.rcTable.interfaceMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.rcTable.AnonCell
import typingsSlinky.rcTable.AnonOnScroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponents[RecordType] extends js.Object {
  var body: js.UndefOr[CustomizeScrollBody[RecordType] | AnonCell] = js.native
  var header: js.UndefOr[AnonCell] = js.native
  var table: js.UndefOr[CustomizeComponent] = js.native
}

object TableComponents {
  @scala.inline
  def apply[RecordType](): TableComponents[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableComponents[RecordType]]
  }
  @scala.inline
  implicit class TableComponentsOps[Self[recordtype] <: TableComponents[recordtype], RecordType] (val x: Self[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RecordType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RecordType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RecordType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RecordType] with Other]
    @scala.inline
    def withBodyFunction2(value: (/* data */ js.Array[RecordType], /* info */ AnonOnScroll) => TagMod[Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBody(value: CustomizeScrollBody[RecordType] | AnonCell): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: AnonCell): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withTableFunctionComponent(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableComponentClass(value: ReactComponentClass[js.Any]): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable(value: CustomizeComponent): Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self[RecordType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
  }
  
}

