package typingsSlinky.firebaseStorage.observerMod

import typingsSlinky.firebaseStorage.errorMod.FirebaseStorageError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageObserver[T] extends js.Object {
  
  var complete: js.UndefOr[CompleteFn] = js.native
  
  var error: js.UndefOr[ErrorFn] = js.native
  
  var next: js.UndefOr[NextFn[T]] = js.native
}
object StorageObserver {
  
  @scala.inline
  def apply[T](): StorageObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageObserver[T]]
  }
  
  @scala.inline
  implicit class StorageObserverOps[Self <: StorageObserver[_], T] (val x: Self with StorageObserver[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setError(value: /* error */ FirebaseStorageError => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setNext(value: T => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
}
