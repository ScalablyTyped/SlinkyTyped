package typingsSlinky.fluxStandardAction.mod

import typingsSlinky.fluxStandardAction.fluxStandardActionBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorFluxStandardAction[Type /* <: String */, CustomError /* <: js.Error */, Meta] extends FluxStandardAction[Type, CustomError, Meta] {
  /**
    * The required `error` property MUST be set to `true` if the action represents an error.
    */
  @JSName("error")
  var error_ErrorFluxStandardAction: `true` = js.native
}

object ErrorFluxStandardAction {
  @scala.inline
  def apply[Type, CustomError, Meta](error: `true`, `type`: Type): ErrorFluxStandardAction[Type, CustomError, Meta] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorFluxStandardAction[Type, CustomError, Meta]]
  }
  @scala.inline
  implicit class ErrorFluxStandardActionOps[Self[`type`, customerror, meta] <: ErrorFluxStandardAction[`type`, customerror, meta], Type, CustomError, Meta] (val x: Self[Type, CustomError, Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type, CustomError, Meta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type, CustomError, Meta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Type, CustomError, Meta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Type, CustomError, Meta]) with Other]
    @scala.inline
    def withError(value: `true`): Self[Type, CustomError, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

