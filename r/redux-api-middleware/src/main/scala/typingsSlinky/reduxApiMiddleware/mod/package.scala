package typingsSlinky.reduxApiMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RSAAActions = (typingsSlinky.reduxApiMiddleware.mod.RSAARequestAction[scala.Nothing, scala.Nothing]) | (typingsSlinky.reduxApiMiddleware.mod.RSAAResultAction[scala.Nothing, scala.Nothing])
  type RSAAFailureAction[Payload, Meta] = typingsSlinky.reduxApiMiddleware.mod.RSAAResultAction[Payload, Meta]
  type RSAAFailureType[State, Payload, Meta] = java.lang.String | js.Symbol | (typingsSlinky.reduxApiMiddleware.mod.RSAAFailureTypeDescriptor[State, Payload, Meta])
  type RSAARequestAction[Payload, Meta] = (typingsSlinky.reduxApiMiddleware.mod.ValidAction[Payload, Meta]) | typingsSlinky.reduxApiMiddleware.mod.InvalidAction[typingsSlinky.reduxApiMiddleware.mod.InvalidRSAA]
  type RSAARequestType[State, Payload, Meta] = java.lang.String | js.Symbol | (typingsSlinky.reduxApiMiddleware.mod.RSAARequestTypeDescriptor[State, Payload, Meta])
  type RSAAResultAction[Payload, Meta] = (typingsSlinky.reduxApiMiddleware.mod.ValidAction[Payload, Meta]) | (typingsSlinky.reduxApiMiddleware.mod.InvalidAction[
    typingsSlinky.reduxApiMiddleware.mod.InternalError | typingsSlinky.reduxApiMiddleware.mod.RequestError | typingsSlinky.reduxApiMiddleware.mod.ApiError[Payload]
  ])
  type RSAASuccessAction[Payload, Meta] = typingsSlinky.reduxApiMiddleware.mod.RSAAResultAction[Payload, Meta]
  type RSAASuccessType[State, Payload, Meta] = java.lang.String | js.Symbol | (typingsSlinky.reduxApiMiddleware.mod.RSAASuccessTypeDescriptor[State, Payload, Meta])
  type TypeOrResolver[Arg, Type] = Type | (js.Function1[/* arg */ Arg, Type])
  type ValidAction[Payload, Meta] = typingsSlinky.reduxApiMiddleware.AnonError with (typingsSlinky.reduxApiMiddleware.AnonPayload[Payload] | js.Object) with (typingsSlinky.reduxApiMiddleware.AnonMeta[Meta] | js.Object)
}
