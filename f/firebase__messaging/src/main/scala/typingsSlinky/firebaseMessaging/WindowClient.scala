package typingsSlinky.firebaseMessaging

import org.scalajs.dom.raw.VisibilityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowClient extends Client {
  
  def focus(): js.Promise[WindowClient] = js.native
  
  val focused: Boolean = js.native
  
  def navigate(url: String): js.Promise[WindowClient] = js.native
  
  val visibilityState: VisibilityState = js.native
}
