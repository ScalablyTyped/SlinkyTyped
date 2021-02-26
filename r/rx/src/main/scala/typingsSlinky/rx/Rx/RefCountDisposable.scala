package typingsSlinky.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefCountDisposable extends Disposable {
  
  /**
    * Returns a dependent disposable that when disposed decreases the refcount on the underlying disposable.
    * @returns {Disposable} A dependent disposable contributing to the reference count that manages the underlying disposable's lifetime.
    */
  def getDisposable(): IDisposable = js.native
  
  /** Is this value disposed. */
  @JSName("isDisposed")
  var isDisposed_RefCountDisposable: Boolean = js.native
}
object RefCountDisposable {
  
  @scala.inline
  def apply(dispose: () => Unit, getDisposable: () => IDisposable, isDisposed: Boolean): RefCountDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getDisposable = js.Any.fromFunction0(getDisposable), isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefCountDisposable]
  }
  
  @scala.inline
  implicit class RefCountDisposableMutableBuilder[Self <: RefCountDisposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDisposable(value: () => IDisposable): Self = StObject.set(x, "getDisposable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
  }
}
