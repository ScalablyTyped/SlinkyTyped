package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotTransportWithFunctionOperations extends PivotTransport {
  @JSName("discover")
  var discover_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
  @JSName("read")
  var read_PivotTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.native
}

object PivotTransportWithFunctionOperations {
  @scala.inline
  def apply(): PivotTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTransportWithFunctionOperations]
  }
  @scala.inline
  implicit class PivotTransportWithFunctionOperationsOps[Self <: PivotTransportWithFunctionOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscover(value: /* options */ DataSourceTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDiscover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discover")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: /* options */ DataSourceTransportOptions => Unit): Self = {
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
  }
  
}

