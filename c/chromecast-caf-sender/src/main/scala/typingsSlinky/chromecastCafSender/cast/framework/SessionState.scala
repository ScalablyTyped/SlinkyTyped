package typingsSlinky.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SessionState extends StObject
@JSGlobal("cast.framework.SessionState")
@js.native
object SessionState extends StObject {
  
  @js.native
  sealed trait NO_SESSION extends SessionState
  
  @js.native
  sealed trait SESSION_ENDED extends SessionState
  
  @js.native
  sealed trait SESSION_ENDING extends SessionState
  
  @js.native
  sealed trait SESSION_RESUMED extends SessionState
  
  @js.native
  sealed trait SESSION_STARTED extends SessionState
  
  @js.native
  sealed trait SESSION_STARTING extends SessionState
  
  @js.native
  sealed trait SESSION_START_FAILED extends SessionState
}
