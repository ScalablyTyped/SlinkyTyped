package typingsSlinky.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReceiverAction extends js.Object
@JSGlobal("chrome.cast.ReceiverAction")
@js.native
object ReceiverAction extends js.Object {
  
  @js.native
  sealed trait CAST extends ReceiverAction
  
  @js.native
  sealed trait STOP extends ReceiverAction
}
