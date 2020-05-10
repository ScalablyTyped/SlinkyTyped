package typingsSlinky.connect.mod

import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerStackItem extends js.Object {
  var handle: ServerHandle = js.native
  var route: String = js.native
}

object ServerStackItem {
  @scala.inline
  def apply(handle: ServerHandle, route: String): ServerStackItem = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStackItem]
  }
  @scala.inline
  implicit class ServerStackItemOps[Self <: ServerStackItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleFunction2(value: (/* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleFunction4(
      value: (/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withHandleFunction3(value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* next */ NextFunction) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHandle(value: ServerHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

