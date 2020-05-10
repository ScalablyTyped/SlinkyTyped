package typingsSlinky.enigmaJs.enigmaJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This section describes the configuration object that is sent into enigma.create(config).
  */
@js.native
trait IConfig extends js.Object {
  /**
    * ES6-compatible Promise library.
    */
  var Promise: js.UndefOr[js.Any] = js.native
  /**
    * A function to use when instantiating the WebSocket, mandatory for Node.js.
    */
  var createSocket: js.UndefOr[js.Any] = js.native
  /**
    * Mixins to extend/augment the QIX Engine API.
    * See Mixins section for more information how each entry in this array should look like.
    * Mixins are applied in the array order.
    */
  var mixins: js.UndefOr[js.Array[IMixin]] = js.native
  /**
    * An object containing additional JSON-RPC request parameters.
    * protocol.delta :  Set to false to disable the use of the bandwidth-reducing delta protocol.
    */
  var protocol: js.UndefOr[js.Any] = js.native
  /**
    * Interceptors for augmenting requests before they are sent to QIX Engine.
    * See Interceptors section for more information how each entry in this array should look like.
    * Interceptors are applied in the array order.
    */
  var requestInterceptors: js.UndefOr[js.Array[IRequestInterceptors]] = js.native
  /**
    * Interceptors for augmenting responses before they are sent to QIX Engine.
    * See Interceptors section for more information how each entry in this array should look like.
    * Interceptors are applied in the array order.
    */
  var responseInterceptors: js.UndefOr[js.Array[IResponseInterceptors]] = js.native
  /**
    * Object containing the specification for the API to generate. Corresponds to a specific version of the QIX Engine API.
    */
  var schema: js.Object = js.native
  /**
    * Set to true if the session should be suspended instead of closed when the websocket is closed.
    */
  var suspendOnClose: js.UndefOr[Boolean] = js.native
  /**
    * String containing a proper websocket URL to QIX Engine.
    */
  var url: String = js.native
}

object IConfig {
  @scala.inline
  def apply(schema: js.Object, url: String): IConfig = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromise(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSocket(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSocket")(js.undefined)
        ret
    }
    @scala.inline
    def withMixins(value: js.Array[IMixin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestInterceptors(value: js.Array[IRequestInterceptors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInterceptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestInterceptors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInterceptors")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseInterceptors(value: js.Array[IResponseInterceptors]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseInterceptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseInterceptors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseInterceptors")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspendOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspendOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendOnClose")(js.undefined)
        ret
    }
  }
  
}

