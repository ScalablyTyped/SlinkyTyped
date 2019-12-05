package typingsSlinky.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServiceSmarthomeSmarthomeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.actionsDashOnDashGoogle.distAssistantMod.AppHandler
  import typingsSlinky.actionsDashOnDashGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
  import typingsSlinky.actionsDashOnDashGoogle.distFrameworkFrameworkMod.Headers
  import typingsSlinky.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1Request
  import typingsSlinky.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod.SmartHomeV1Response

  type SmartHome = js.Function1[/* options */ js.UndefOr[SmartHomeOptions], AppHandler with SmartHomeApp]
  type SmartHomeHandler[TRequest /* <: SmartHomeV1Request */, TResponse /* <: SmartHomeV1Response */] = js.Function3[
    /* body */ TRequest, 
    /* headers */ Headers, 
    /* framework */ BuiltinFrameworkMetadata, 
    TResponse | js.Promise[TResponse]
  ]
  type SmartHomeHandlers = StringDictionary[SmartHomeHandler[SmartHomeV1Request, SmartHomeV1Response]]
}
