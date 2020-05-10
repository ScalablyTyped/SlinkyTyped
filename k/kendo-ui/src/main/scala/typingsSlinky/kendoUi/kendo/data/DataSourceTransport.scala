package typingsSlinky.kendoUi.kendo.data

import typingsSlinky.kendoUi.kendoUiStrings.create
import typingsSlinky.kendoUi.kendoUiStrings.destroy
import typingsSlinky.kendoUi.kendoUiStrings.read
import typingsSlinky.kendoUi.kendoUiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceTransport extends js.Object {
  var create: js.UndefOr[
    String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
  var destroy: js.UndefOr[
    String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
  var parameterMap: js.UndefOr[
    js.Function2[
      /* data */ DataSourceTransportParameterMapData, 
      /* type */ create | destroy | read | update, 
      _
    ]
  ] = js.native
  var push: js.UndefOr[js.Function] = js.native
  var read: js.UndefOr[
    String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
  var signalr: js.UndefOr[
    DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
  var submit: js.UndefOr[js.Function] = js.native
  var update: js.UndefOr[
    String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.native
}

object DataSourceTransport {
  @scala.inline
  def apply(): DataSourceTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransport]
  }
  @scala.inline
  implicit class DataSourceTransportOps[Self <: DataSourceTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(
      value: String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(
      value: String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterMap(
      value: (/* data */ DataSourceTransportParameterMapData, /* type */ create | destroy | read | update) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterMap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParameterMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterMap")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withReadFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(
      value: String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = {
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
    @scala.inline
    def withSignalrFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSignalr(value: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalr")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateFunction1(value: /* options */ DataSourceTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(
      value: String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
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

