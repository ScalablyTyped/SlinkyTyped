package typingsSlinky.fluxStandardAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorFSA[CustomError /* <: js.Error */, Meta, Type /* <: java.lang.String */] = typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardAction[Type, CustomError, Meta]
  type ErrorFSAAuto[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardActionAuto[Type, CustomError, Meta]
  type ErrorFSAWithMeta[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardActionWithMeta[Type, CustomError, Meta]
  type ErrorFSAWithPayload[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]
  type ErrorFSAWithPayloadAndMeta[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]
  type ErrorFluxStandardActionWithMeta[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = (typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardAction[Type, CustomError, Meta]) with (typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithPayload[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = (typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardAction[Type, CustomError, Meta]) with (typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithPayloadAndMeta[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = (typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]) with (typingsSlinky.fluxStandardAction.mod.ErrorFluxStandardActionWithMeta[Type, CustomError, Meta])
  type FSA[Type /* <: java.lang.String */, Payload, Meta] = typingsSlinky.fluxStandardAction.mod.FluxStandardAction[Type, Payload, Meta]
  type FSAAuto[Type /* <: java.lang.String */, Payload, Meta] = typingsSlinky.fluxStandardAction.mod.FluxStandardActionAuto[Type, Payload, Meta]
  type FSAWithMeta[Type /* <: java.lang.String */, Payload, Meta] = typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, Payload, Meta]
  type FSAWithPayload[Type /* <: java.lang.String */, Payload, Meta] = typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, Payload, Meta]
  type FSAWithPayloadAndMeta[Type /* <: java.lang.String */, Payload, Meta] = typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
  type FluxStandardActionWithPayloadAndMeta[Type /* <: java.lang.String */, Payload, Meta] = (typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, Payload, Meta]) with (typingsSlinky.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, Payload, Meta])
}
