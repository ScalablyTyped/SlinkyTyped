package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotTransportWithObjectOperations extends PivotTransport {
  var connection: PivotTransportConnection = js.native
  @JSName("discover")
  var discover_PivotTransportWithObjectOperations: js.UndefOr[PivotTransportDiscover] = js.native
  @JSName("read")
  var read_PivotTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.native
}

object PivotTransportWithObjectOperations {
  @scala.inline
  def apply(connection: PivotTransportConnection): PivotTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTransportWithObjectOperations]
  }
  @scala.inline
  implicit class PivotTransportWithObjectOperationsOps[Self <: PivotTransportWithObjectOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: PivotTransportConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscover(value: PivotTransportDiscover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discover")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: DataSourceTransportRead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
  }
  
}

