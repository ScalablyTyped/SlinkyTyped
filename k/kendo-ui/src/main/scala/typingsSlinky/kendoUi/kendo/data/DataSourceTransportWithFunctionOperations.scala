package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceTransportWithFunctionOperations extends DataSourceTransport {
  @JSName("create")
  var create_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
  @JSName("destroy")
  var destroy_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
  @JSName("read")
  var read_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportReadOptions, Unit]] = js.native
  @JSName("update")
  var update_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
}

object DataSourceTransportWithFunctionOperations {
  @scala.inline
  def apply(): DataSourceTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportWithFunctionOperations]
  }
  @scala.inline
  implicit class DataSourceTransportWithFunctionOperationsOps[Self <: DataSourceTransportWithFunctionOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: /* options */ DataSourceTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* options */ DataSourceTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: /* options */ DataSourceTransportReadOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: /* options */ DataSourceTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

