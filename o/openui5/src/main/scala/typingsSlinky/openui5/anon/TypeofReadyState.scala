package typingsSlinky.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReadyState extends js.Object {
  /**
    * The connection has been closed or could not be opened.
    */
  var CLOSED: js.Any = js.native
  /**
    * The connection is going through the closing handshake.
    */
  var CLOSING: js.Any = js.native
  /**
    * The connection has not yet been established.
    */
  var CONNECTING: js.Any = js.native
  /**
    * The WebSocket connection is established and communication is possible.
    */
  var OPEN: js.Any = js.native
}

object TypeofReadyState {
  @scala.inline
  def apply(CLOSED: js.Any, CLOSING: js.Any, CONNECTING: js.Any, OPEN: js.Any): TypeofReadyState = {
    val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReadyState]
  }
  @scala.inline
  implicit class TypeofReadyStateOps[Self <: TypeofReadyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLOSED(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLOSING(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCONNECTING(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

