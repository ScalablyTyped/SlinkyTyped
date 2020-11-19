package typingsSlinky.aureliaMetadata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecoratorApplicator extends js.Object {
  
  /**
    * Applies the decorators to the target.
    * @param target The target.
    * @param key If applying to a method, the member name.
    * @param descriptor If applying to a method, you may supply an initial descriptor to pass to the decorators.
    */
  def on(target: js.Any): js.Any = js.native
  def on(target: js.Any, key: js.UndefOr[scala.Nothing], descriptor: js.PropertyDescriptor): js.Any = js.native
  def on(target: js.Any, key: String): js.Any = js.native
  def on(target: js.Any, key: String, descriptor: js.PropertyDescriptor): js.Any = js.native
}
