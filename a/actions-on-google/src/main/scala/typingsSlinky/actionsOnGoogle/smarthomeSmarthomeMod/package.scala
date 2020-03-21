package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object smarthomeSmarthomeMod {
  type SmartHomeHandler[TRequest /* <: typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1Request */, TResponse /* <: typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1Response */] = js.Function3[
    /* body */ TRequest, 
    /* headers */ typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.Headers, 
    /* framework */ typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata, 
    TResponse | js.Promise[TResponse]
  ]
  type SmartHomeHandlers = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.actionsOnGoogle.smarthomeSmarthomeMod.SmartHomeHandler[
      typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1Request, 
      typingsSlinky.actionsOnGoogle.apiV1Mod.SmartHomeV1Response
    ]
  ]
  type SmartHome_ = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.actionsOnGoogle.smarthomeSmarthomeMod.SmartHomeOptions], 
    typingsSlinky.actionsOnGoogle.assistantMod.AppHandler with typingsSlinky.actionsOnGoogle.smarthomeSmarthomeMod.SmartHomeApp
  ]
}
