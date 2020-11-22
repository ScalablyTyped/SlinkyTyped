package typingsSlinky.emberTest.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter extends js.Object {
  
  /**
    * This callback will be called whenever an async operation has completed.
    */
  def asyncEnd(): js.Any = js.native
  
  /**
    * This callback will be called whenever an async operation is about to start.
    */
  def asyncStart(): js.Any = js.native
  
  /**
    * Override this method with your testing framework's false assertion.
    * This function is called whenever an exception occurs causing the testing
    * promise to fail.
    */
  def exception(error: String): js.Any = js.native
}
object Adapter {
  
  @scala.inline
  def apply(asyncEnd: () => js.Any, asyncStart: () => js.Any, exception: String => js.Any): Adapter = {
    val __obj = js.Dynamic.literal(asyncEnd = js.Any.fromFunction0(asyncEnd), asyncStart = js.Any.fromFunction0(asyncStart), exception = js.Any.fromFunction1(exception))
    __obj.asInstanceOf[Adapter]
  }
  
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    
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
    def setAsyncEnd(value: () => js.Any): Self = this.set("asyncEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsyncStart(value: () => js.Any): Self = this.set("asyncStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setException(value: String => js.Any): Self = this.set("exception", js.Any.fromFunction1(value))
  }
}
