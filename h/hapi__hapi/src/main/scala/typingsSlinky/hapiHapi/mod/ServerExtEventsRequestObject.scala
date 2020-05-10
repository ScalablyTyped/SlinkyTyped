package typingsSlinky.hapiHapi.mod

import typingsSlinky.hapiHapi.mod.Lifecycle.Method
import typingsSlinky.hapiHapi.mod.Lifecycle.ReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerExtEventsRequestObject extends js.Object {
  /**
    * (required) a function or an array of functions to be executed at a specified point during request processing. The required extension function signature is:
    * * server extension points: async function(server) where:
    * * * server - the server object.
    * * * this - the object provided via options.bind or the current active context set with server.bind().
    * * request extension points: a lifecycle method.
    */
  var method: Method | js.Array[Method] = js.native
  /**
    * (optional) an object with the following:
    * * before - a string or array of strings of plugin names this method must execute before (on the same event). Otherwise, extension methods are executed in the order added.
    * * after - a string or array of strings of plugin names this method must execute after (on the same event). Otherwise, extension methods are executed in the order added.
    * * bind - a context object passed back to the provided method (via this) when called. Ignored if the method is an arrow function.
    * * sandbox - if set to 'plugin' when adding a request extension points the extension is only added to routes defined by the current plugin. Not allowed when configuring route-level extensions,
    * or when adding server extensions. Defaults to 'server' which applies to any route added to the server the extension is added to.
    */
  var options: js.UndefOr[ServerExtOptions] = js.native
  /**
    * (required) the extension point event name. The available extension points include the request extension points as well as the following server extension points:
    * * 'onPreStart' - called before the connection listeners are started.
    * * 'onPostStart' - called after the connection listeners are started.
    * * 'onPreStop' - called before the connection listeners are stopped.
    * * 'onPostStop' - called after the connection listeners are stopped.
    */
  var `type`: ServerRequestExtType = js.native
}

object ServerExtEventsRequestObject {
  @scala.inline
  def apply(method: Method | js.Array[Method], `type`: ServerRequestExtType): ServerExtEventsRequestObject = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerExtEventsRequestObject]
  }
  @scala.inline
  implicit class ServerExtEventsRequestObjectOps[Self <: ServerExtEventsRequestObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethodFunction3(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[js.Error]) => ReturnValue
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMethod(value: Method | js.Array[Method]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ServerRequestExtType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ServerExtOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

