package typingsSlinky.angularTranslate.mod.angularAugmentingMod.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPartialLoader[T] extends js.Object {
  
  def addPart(name: String): T = js.native
  def addPart(name: String, priority: Double): T = js.native
  
  def deletePart(name: String): T = js.native
  
  def isPartAvailable(name: String): Boolean = js.native
}
