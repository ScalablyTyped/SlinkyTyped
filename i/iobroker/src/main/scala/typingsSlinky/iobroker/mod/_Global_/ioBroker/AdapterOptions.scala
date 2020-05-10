package typingsSlinky.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterOptions extends js.Object {
  /** provide alternative global configuration for the adapter. Default: null */
  var config: js.UndefOr[js.Any] = js.native
  /** path to adapter */
  var dirname: js.UndefOr[String] = js.native
  /** instance of the created adapter. Default: null */
  var instance: js.UndefOr[Double] = js.native
  /** If the adapter collects logs from all adapters (experts only). Default: false */
  var logTransporter: js.UndefOr[Boolean] = js.native
  /** Handler for received adapter messages. Can only be used if messagebox in io-package.json is set to true. */
  var message: js.UndefOr[MessageHandler] = js.native
  /** The name of the adapter */
  var name: String = js.native
  /** if true, stateChange will be called with an id that has no namespace, e.g. "state" instead of "adapter.0.state". Default: false */
  var noNamespace: js.UndefOr[Boolean] = js.native
  /** Handler for changes of subscribed objects */
  var objectChange: js.UndefOr[ObjectChangeHandler] = js.native
  /** If true, the adapter will have a property `oObjects` that contains a live cache of the adapter's objects */
  var objects: js.UndefOr[Boolean] = js.native
  /** Will be called when the adapter is intialized */
  var ready: js.UndefOr[ReadyHandler] = js.native
  /** Handler for changes of subscribed states */
  var stateChange: js.UndefOr[StateChangeHandler] = js.native
  /** If true, the adapter will have a property `oStates` that contains a live cache of the adapter's states */
  var states: js.UndefOr[Boolean] = js.native
  /** if the global system config should be included in the created object. Default: false */
  var systemConfig: js.UndefOr[Boolean] = js.native
  /** Will be called on adapter termination */
  var unload: js.UndefOr[UnloadHandler] = js.native
  /** If the adapter needs access to the formatDate function to format dates according to the global settings. Default: false */
  var useFormatDate: js.UndefOr[Boolean] = js.native
}

object AdapterOptions {
  @scala.inline
  def apply(name: String): AdapterOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdapterOptions]
  }
  @scala.inline
  implicit class AdapterOptionsOps[Self <: AdapterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withDirname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirname")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withLogTransporter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTransporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogTransporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTransporter")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: /* obj */ Message => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withNoNamespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectChange(value: (/* id */ String, /* obj */ js.UndefOr[Object | Null]) => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutObjectChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectChange")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChange(value: (/* id */ String, /* obj */ js.UndefOr[State | Null]) => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUnload(value: /* callback */ EmptyCallback => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFormatDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFormatDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFormatDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFormatDate")(js.undefined)
        ret
    }
  }
  
}

