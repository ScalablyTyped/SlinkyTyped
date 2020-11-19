package typingsSlinky.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TriggerModule extends js.Object
@JSGlobal("CbServer.TriggerModule")
@js.native
object TriggerModule extends js.Object {
  
  @js.native
  sealed trait DEVICE extends TriggerModule
  
  @js.native
  sealed trait Data extends TriggerModule
  
  @js.native
  sealed trait MESSAGING extends TriggerModule
  
  @js.native
  sealed trait USER extends TriggerModule
}
