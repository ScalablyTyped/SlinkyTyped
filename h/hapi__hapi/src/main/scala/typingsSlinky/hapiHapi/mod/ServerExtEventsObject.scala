package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerExtEventsObject extends js.Object {
  /**
    * (required) a function or an array of functions to be executed at a specified point during request processing. The required extension function signature is:
    * * server extension points: async function(server) where:
    * * * server - the server object.
    * * * this - the object provided via options.bind or the current active context set with server.bind().
    * * request extension points: a lifecycle method.
    */
  var method: ServerExtPointFunction | js.Array[ServerExtPointFunction] = js.native
  var options: js.UndefOr[ServerExtOptions] = js.native
  /**
    * (required) the extension point event name. The available extension points include the request extension points as well as the following server extension points:
    * * 'onPreStart' - called before the connection listeners are started.
    * * 'onPostStart' - called after the connection listeners are started.
    * * 'onPreStop' - called before the connection listeners are stopped.
    */
  var `type`: ServerExtType = js.native
}

object ServerExtEventsObject {
  @scala.inline
  def apply(method: ServerExtPointFunction | js.Array[ServerExtPointFunction], `type`: ServerExtType): ServerExtEventsObject = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerExtEventsObject]
  }
  @scala.inline
  implicit class ServerExtEventsObjectOps[Self <: ServerExtEventsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethodFunction1(value: /* server */ Server_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMethod(value: ServerExtPointFunction | js.Array[ServerExtPointFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ServerExtType): Self = {
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

