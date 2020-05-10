package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a join room request.
  */
@js.native
trait SchemaRoomJoinRequest extends js.Object {
  /**
    * The capabilities that this client supports for realtime communication.
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  /**
    * Client address for the player joining the room.
    */
  var clientAddress: js.UndefOr[SchemaRoomClientAddress] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomJoinRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Network diagnostics for the client joining the room.
    */
  var networkDiagnostics: js.UndefOr[SchemaNetworkDiagnostics] = js.native
}

object SchemaRoomJoinRequest {
  @scala.inline
  def apply(): SchemaRoomJoinRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomJoinRequest]
  }
  @scala.inline
  implicit class SchemaRoomJoinRequestOps[Self <: SchemaRoomJoinRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withClientAddress(value: SchemaRoomClientAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkDiagnostics(value: SchemaNetworkDiagnostics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkDiagnostics")(js.undefined)
        ret
    }
  }
  
}

