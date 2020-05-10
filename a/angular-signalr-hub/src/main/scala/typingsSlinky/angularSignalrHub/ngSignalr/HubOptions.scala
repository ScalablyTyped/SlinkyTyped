package typingsSlinky.angularSignalrHub.ngSignalr

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.signalr.SignalR.StateChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HubOptions extends js.Object {
  /**
    * Function to handle hub connection errors
    */
  var errorHandler: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  /**
    * Collection of client side callbacks
    */
  var listeners: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]] = js.native
  /**
    * Enable/disable logging
    */
  var logging: js.UndefOr[Boolean] = js.native
  /**
    * String array of server side methods which the client can call
    */
  var methods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Object representing additional query params to be sent on connection
    */
  var queryParams: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Sets the root path for the SignalR web service
    */
  var rootPath: js.UndefOr[String] = js.native
  /**
    * Function to handle hub connection state changed event
    */
  var stateChanged: js.UndefOr[js.Function1[/* state */ StateChanged, Unit]] = js.native
  /**
    * Sets transport method (e.g    'longPolling'    or    ['webSockets', 'longPolling'] )
    */
  var transport: js.UndefOr[js.Any] = js.native
  /**
    * Use a shared global connection or create a new one just for this hub, defaults to true
    */
  var useSharedConnection: js.UndefOr[Boolean] = js.native
}

object HubOptions {
  @scala.inline
  def apply(): HubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HubOptions]
  }
  @scala.inline
  implicit class HubOptionsOps[Self <: HubOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorHandler(value: /* error */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withListeners(value: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParams(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withRootPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPath")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChanged(value: /* state */ StateChanged => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSharedConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSharedConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSharedConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSharedConnection")(js.undefined)
        ret
    }
  }
  
}

