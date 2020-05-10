package typingsSlinky.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fluxStandardAction.mod._FluxStandardActionAuto because Already inherited */ @js.native
trait FluxStandardActionWithPayload[Type /* <: String */, Payload, Meta] extends FluxStandardAction[Type, Payload, Meta] {
  /**
    * The required `payload` property MAY be any type of value.
    * It represents the payload of the action.
    * Any information about the action that is not the type or status of the action should be part of the `payload` field.
    * By convention, if `error` is `true`, the `payload` SHOULD be an error object.
    * This is akin to rejecting a promise with an error object.
    */
  @JSName("payload")
  var payload_FluxStandardActionWithPayload: Payload = js.native
}

object FluxStandardActionWithPayload {
  @scala.inline
  def apply[Type, Payload, Meta](payload: Payload, `type`: Type): FluxStandardActionWithPayload[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardActionWithPayload[Type, Payload, Meta]]
  }
  @scala.inline
  implicit class FluxStandardActionWithPayloadOps[Self[`type`, payload, meta] <: FluxStandardActionWithPayload[`type`, payload, meta], Type, Payload, Meta] (val x: Self[Type, Payload, Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type, Payload, Meta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type, Payload, Meta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Type, Payload, Meta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Type, Payload, Meta]) with Other]
    @scala.inline
    def withPayload(value: Payload): Self[Type, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

