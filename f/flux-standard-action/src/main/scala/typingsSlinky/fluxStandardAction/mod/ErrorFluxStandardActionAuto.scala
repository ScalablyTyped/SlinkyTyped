package typingsSlinky.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]
  - typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]
*/
trait ErrorFluxStandardActionAuto[Type /* <: String */, CustomError /* <: js.Error */, Meta] extends js.Object

object ErrorFluxStandardActionAuto {
  @scala.inline
  implicit def apply[Type, CustomError, Meta](
    value: (ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]) | (ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta])
  ): ErrorFluxStandardActionAuto[Type, CustomError, Meta] = value.asInstanceOf[ErrorFluxStandardActionAuto[Type, CustomError, Meta]]
}

