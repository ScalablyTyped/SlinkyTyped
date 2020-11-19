package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInteractionService extends js.Object {
  
  def getLastInteractionType(): String | Null = js.native
  
  def isUserInvoked(): Boolean = js.native
  def isUserInvoked(checkDelay: Double): Boolean = js.native
}
