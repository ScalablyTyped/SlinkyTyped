package typingsSlinky.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionStatus extends StObject
@JSGlobal("chrome.cast.SessionStatus")
@js.native
object SessionStatus extends StObject {
  
  @js.native
  sealed trait CONNECTED extends SessionStatus
  
  @js.native
  sealed trait DISCONNECTED extends SessionStatus
  
  @js.native
  sealed trait STOPPED extends SessionStatus
}
