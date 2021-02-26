package typingsSlinky.rxLite.Rx

import typingsSlinky.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Single assignment
@js.native
trait SingleAssignmentDisposable extends IDisposable {
  
  var current: IDisposable = js.native
  
  def getDisposable(): IDisposable = js.native
  
  var isDisposed: Boolean = js.native
  
  def setDisposable(value: IDisposable): Unit = js.native
}
object SingleAssignmentDisposable {
  
  @scala.inline
  def apply(
    current: IDisposable,
    dispose: () => Unit,
    getDisposable: () => IDisposable,
    isDisposed: Boolean,
    setDisposable: IDisposable => Unit
  ): SingleAssignmentDisposable = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getDisposable = js.Any.fromFunction0(getDisposable), isDisposed = isDisposed.asInstanceOf[js.Any], setDisposable = js.Any.fromFunction1(setDisposable))
    __obj.asInstanceOf[SingleAssignmentDisposable]
  }
  
  @scala.inline
  implicit class SingleAssignmentDisposableMutableBuilder[Self <: SingleAssignmentDisposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: IDisposable): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDisposable(value: () => IDisposable): Self = StObject.set(x, "getDisposable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDisposable(value: IDisposable => Unit): Self = StObject.set(x, "setDisposable", js.Any.fromFunction1(value))
  }
}
