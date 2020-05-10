package typingsSlinky.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluxStandardAction[Type /* <: String */, Payload, Meta] extends _FluxStandardActionAuto[Type, Payload, Meta] {
  /**
    * The optional `error` property MAY be set to true if the action represents an error.
    * An action whose `error` is true is analogous to a rejected Promise.
    * By convention, the `payload` SHOULD be an error object.
    * If `error` has any other value besides `true`, including `undefined`, the action MUST NOT be interpreted as an error.
    */
  var error: js.UndefOr[Boolean] = js.native
  /**
    * The optional `meta` property MAY be any type of value.
    * It is intended for any extra information that is not part of the payload.
    */
  var meta: js.UndefOr[Meta] = js.native
  /**
    * The optional `payload` property MAY be any type of value.
    * It represents the payload of the action.
    * Any information about the action that is not the type or status of the action should be part of the `payload` field.
    * By convention, if `error` is `true`, the `payload` SHOULD be an error object.
    * This is akin to rejecting a promise with an error object.
    */
  var payload: js.UndefOr[Payload] = js.native
  /**
    * The `type` of an action identifies to the consumer the nature of the action that has occurred.
    * Two actions with the same `type` MUST be strictly equivalent (using `===`)
    */
  var `type`: Type = js.native
}

object FluxStandardAction {
  @scala.inline
  def apply[Type, Payload, Meta](`type`: Type): FluxStandardAction[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardAction[Type, Payload, Meta]]
  }
  @scala.inline
  implicit class FluxStandardActionOps[Self[`type`, payload, meta] <: FluxStandardAction[`type`, payload, meta], Type, Payload, Meta] (val x: Self[Type, Payload, Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type, Payload, Meta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type, Payload, Meta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Type, Payload, Meta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Type, Payload, Meta]) with Other]
    @scala.inline
    def withType(value: Type): Self[Type, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Boolean): Self[Type, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[Type, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: Meta): Self[Type, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[Type, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: Payload): Self[Type, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self[Type, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

