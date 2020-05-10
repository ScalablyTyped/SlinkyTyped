package typingsSlinky.extjs.Ext.direct

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProvider extends IObservable {
  /** [Method] Abstract method for subclasses to implement  */
  var connect: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Abstract method for subclasses to implement  */
  var disconnect: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Method] Returns whether or not the server side is currently connected  */
  var isConnected: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String[]) */
  var relayedEvents: js.UndefOr[Array] = js.native
}

object IProvider {
  @scala.inline
  def apply(): IProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProvider]
  }
  @scala.inline
  implicit class IProviderOps[Self <: IProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsConnected(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayedEvents(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayedEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelayedEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayedEvents")(js.undefined)
        ret
    }
  }
  
}

