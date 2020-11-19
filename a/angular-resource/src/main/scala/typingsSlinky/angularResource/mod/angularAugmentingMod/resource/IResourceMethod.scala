package typingsSlinky.angularResource.mod.angularAugmentingMod.resource

import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Allow specify more resource methods
// No need to add duplicates for all four overloads.
@js.native
trait IResourceMethod[T] extends js.Object {
  
  def apply(): T = js.native
  def apply(params: js.Object): T = js.native
  def apply(params: js.Object, data: js.Object): T = js.native
  def apply(params: js.Object, data: js.Object, success: js.UndefOr[scala.Nothing], error: Function): T = js.native
  def apply(params: js.Object, data: js.Object, success: Function): T = js.native
  def apply(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
  def apply(params: js.Object, success: Function): T = js.native
  def apply(params: js.Object, success: Function, error: Function): T = js.native
  def apply(success: Function): T = js.native
  def apply(success: Function, error: Function): T = js.native
}
