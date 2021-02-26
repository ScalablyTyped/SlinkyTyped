package typingsSlinky.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextKey[T] extends StObject {
  
  def get(): js.UndefOr[T] = js.native
  
  def reset(): Unit = js.native
  
  def set(value: T): Unit = js.native
}
object IContextKey {
  
  @scala.inline
  def apply[T](get: () => js.UndefOr[T], reset: () => Unit, set: T => Unit): IContextKey[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IContextKey[T]]
  }
  
  @scala.inline
  implicit class IContextKeyMutableBuilder[Self <: IContextKey[_], T] (val x: Self with IContextKey[T]) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
