package typingsSlinky.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disposable extends StObject {
  
  /**
    * Performs tasks associated with freeing, releasing, or resetting resources.
    */
  def dispose(): Unit = js.native
}
object Disposable {
  
  @scala.inline
  def apply(dispose: () => Unit): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[Disposable]
  }
  
  @scala.inline
  implicit class DisposableMutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
