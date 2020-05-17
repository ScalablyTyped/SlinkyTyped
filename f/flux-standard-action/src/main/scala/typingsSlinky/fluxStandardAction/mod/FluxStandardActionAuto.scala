package typingsSlinky.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
  - typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, Payload, Meta]
  - typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, Payload, Meta]
  - typingsSlinky.fluxStandardAction.mod.FluxStandardAction[Type, Payload, Meta]
*/
trait FluxStandardActionAuto[Type /* <: String */, Payload, Meta] extends js.Object

object FluxStandardActionAuto {
  @scala.inline
  implicit def apply[Type, Payload, Meta](
    value: (FluxStandardActionWithPayload[Type, Payload, Meta]) | (FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta])
  ): FluxStandardActionAuto[Type, Payload, Meta] = value.asInstanceOf[FluxStandardActionAuto[Type, Payload, Meta]]
  @scala.inline
  implicit def apply[Type, Payload, Meta](value: FluxStandardAction[Type, Payload, Meta]): FluxStandardActionAuto[Type, Payload, Meta] = value.asInstanceOf[FluxStandardActionAuto[Type, Payload, Meta]]
  @scala.inline
  implicit def apply[Type, Payload, Meta](value: FluxStandardActionWithMeta[Type, Payload, Meta]): FluxStandardActionAuto[Type, Payload, Meta] = value.asInstanceOf[FluxStandardActionAuto[Type, Payload, Meta]]
}

