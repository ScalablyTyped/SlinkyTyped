package typingsSlinky.clearbladejsDashServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* "Device" */ val DEVICE: typingsSlinky.clearbladejsDashServer.CbServer.TriggerModule.DEVICE with String = js.native
  /* "Data" */ val Data: typingsSlinky.clearbladejsDashServer.CbServer.TriggerModule.Data with String = js.native
  /* "Messaging" */ val MESSAGING: typingsSlinky.clearbladejsDashServer.CbServer.TriggerModule.MESSAGING with String = js.native
  /* "User" */ val USER: typingsSlinky.clearbladejsDashServer.CbServer.TriggerModule.USER with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TriggerModule with String] = js.native
}

