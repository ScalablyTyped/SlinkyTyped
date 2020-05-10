package typingsSlinky.firebaseFirestore.localSharedClientStateSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedOnlineStateSchema extends js.Object {
  /**
    * The clientId of the client that wrote this onlineState value. Tracked so
    * that on startup, clients can check if this client is still active when
    * determining whether to apply this value or not.
    */
  val clientId: String = js.native
  val onlineState: String = js.native
}

object SharedOnlineStateSchema {
  @scala.inline
  def apply(clientId: String, onlineState: String): SharedOnlineStateSchema = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], onlineState = onlineState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedOnlineStateSchema]
  }
  @scala.inline
  implicit class SharedOnlineStateSchemaOps[Self <: SharedOnlineStateSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlineState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

