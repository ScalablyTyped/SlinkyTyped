package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import org.scalajs.dom.raw.Element
import typingsSlinky.angular.JQuery
import typingsSlinky.angularMaterial.angularMaterialBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastPreset[T] extends js.Object {
  
  def action(action: String): T = js.native
  
  def capsule(capsule: Boolean): T = js.native
  
  def hideDelay(delay: Double): T = js.native
  @JSName("hideDelay")
  def hideDelay_false(delay: `false`): T = js.native
  
  def highlightAction(highlightAction: Boolean): T = js.native
  
  def highlightClass(highlightClass: String): T = js.native
  
  def parent(): T = js.native
  def parent(parent: String): T = js.native
  def parent(parent: JQuery): T = js.native
  def parent(parent: Element): T = js.native
  
  def position(position: String): T = js.native
  
  def textContent(content: String): T = js.native
  
  def theme(theme: String): T = js.native
  
   // default: root node
  def toastClass(toastClass: String): T = js.native
}
