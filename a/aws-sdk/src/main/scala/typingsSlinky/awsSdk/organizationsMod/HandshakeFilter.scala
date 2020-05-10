package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandshakeFilter extends js.Object {
  /**
    * Specifies the type of handshake action. If you specify ActionType, you cannot also specify ParentHandshakeId.
    */
  var ActionType: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.ActionType] = js.native
  /**
    * Specifies the parent handshake. Only used for handshake types that are a child of another type. If you specify ParentHandshakeId, you cannot also specify ActionType. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
    */
  var ParentHandshakeId: js.UndefOr[HandshakeId] = js.native
}

object HandshakeFilter {
  @scala.inline
  def apply(): HandshakeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandshakeFilter]
  }
  @scala.inline
  implicit class HandshakeFilterOps[Self <: HandshakeFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: ActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(js.undefined)
        ret
    }
    @scala.inline
    def withParentHandshakeId(value: HandshakeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentHandshakeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentHandshakeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentHandshakeId")(js.undefined)
        ret
    }
  }
  
}

