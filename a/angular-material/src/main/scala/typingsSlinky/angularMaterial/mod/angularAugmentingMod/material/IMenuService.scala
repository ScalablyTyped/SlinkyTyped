package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.angular.JQueryEventObject
import typingsSlinky.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMenuService extends StObject {
  
  def close(): Unit = js.native
  
  def hide(): IPromise[_] = js.native
  def hide(response: js.UndefOr[scala.Nothing], options: js.Any): IPromise[_] = js.native
  def hide(response: js.Any): IPromise[_] = js.native
  def hide(response: js.Any, options: js.Any): IPromise[_] = js.native
  
  def open(): Unit = js.native
  def open(event: MouseEvent): Unit = js.native
  def open(event: JQueryEventObject): Unit = js.native
}
