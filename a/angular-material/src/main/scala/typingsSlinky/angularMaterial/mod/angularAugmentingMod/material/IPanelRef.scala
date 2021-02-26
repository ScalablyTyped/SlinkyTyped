package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import typingsSlinky.angular.JQuery
import typingsSlinky.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelRef extends StObject {
  
  def addClass(newClass: String): Unit = js.native
  
  def attach(): IPromise[_] = js.native
  
  def close(): IPromise[_] = js.native
  
  var config: IPanelConfig = js.native
  
  def destroy(): Unit = js.native
  
  def detach(): IPromise[_] = js.native
  
  def hide(): IPromise[_] = js.native
  
  var id: String = js.native
  
  var isAttached: Boolean = js.native
  
  def open(): IPromise[_] = js.native
  
  var panelContainer: JQuery = js.native
  
  var panelEl: JQuery = js.native
  
  def registerInterceptor(`type`: String, callback: js.Function0[IPromise[_]]): IPanelRef = js.native
  
  def removeAllInterceptors(): IPanelRef = js.native
  def removeAllInterceptors(`type`: String): IPanelRef = js.native
  
  def removeClass(oldClass: String): Unit = js.native
  
  def removeInterceptor(`type`: String, callback: js.Function0[IPromise[_]]): IPanelRef = js.native
  
  def show(): IPromise[_] = js.native
  
  def toggleClass(toggleClass: String): Unit = js.native
  
  def updateAnimation(animation: IPanelAnimation): Unit = js.native
  
  def updatePosition(position: IPanelPosition): Unit = js.native
}
