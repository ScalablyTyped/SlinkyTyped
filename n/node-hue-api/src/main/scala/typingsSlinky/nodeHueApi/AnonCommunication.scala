package typingsSlinky.nodeHueApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommunication extends js.Object {
  var communication: String = js.native
  var incoming: Boolean = js.native
  var outgoing: Boolean = js.native
  var signedon: Boolean = js.native
}

object AnonCommunication {
  @scala.inline
  def apply(communication: String, incoming: Boolean, outgoing: Boolean, signedon: Boolean): AnonCommunication = {
    val __obj = js.Dynamic.literal(communication = communication.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], signedon = signedon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommunication]
  }
  @scala.inline
  implicit class AnonCommunicationOps[Self <: AnonCommunication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommunication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("communication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncoming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incoming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

