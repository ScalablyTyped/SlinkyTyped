package typingsSlinky.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WSStatus extends StObject
@JSImport("jsprintmanager", "JSPM.WSStatus")
@js.native
object WSStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WSStatus with Double] = js.native
  
  @js.native
  sealed trait BlackListed extends WSStatus
  /* 2 */ val BlackListed: typingsSlinky.jsprintmanager.mod.JSPM.WSStatus.BlackListed with Double = js.native
  
  @js.native
  sealed trait Closed extends WSStatus
  /* 1 */ val Closed: typingsSlinky.jsprintmanager.mod.JSPM.WSStatus.Closed with Double = js.native
  
  @js.native
  sealed trait Open extends WSStatus
  /* 0 */ val Open: typingsSlinky.jsprintmanager.mod.JSPM.WSStatus.Open with Double = js.native
  
  @js.native
  sealed trait WaitingForUserResponse extends WSStatus
  /* 3 */ val WaitingForUserResponse: typingsSlinky.jsprintmanager.mod.JSPM.WSStatus.WaitingForUserResponse with Double = js.native
}
