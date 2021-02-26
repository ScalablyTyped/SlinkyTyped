package typingsSlinky.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the base class for events that can be canceled.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311009(v=vs.100).aspx}
  */
@js.native
trait CancelEventArgs extends EventArgs {
  
  /*
    * true to request that the event be canceled; otherwise, false. The default is false.
    * @return if the event is to be canceled; otherwise, false.
    */
  def get_cancel(): Boolean = js.native
  
  //#endregion
  //#region Properties
  /**
    * true to request that the event be canceled; otherwise, false. The default is false.
    */
  def set_cancel(value: Boolean): Unit = js.native
}
object CancelEventArgs {
  
  @scala.inline
  def apply(Empty: EventArgs, get_cancel: () => Boolean, set_cancel: Boolean => Unit): CancelEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_cancel = js.Any.fromFunction0(get_cancel), set_cancel = js.Any.fromFunction1(set_cancel))
    __obj.asInstanceOf[CancelEventArgs]
  }
  
  @scala.inline
  implicit class CancelEventArgsMutableBuilder[Self <: CancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_cancel(value: () => Boolean): Self = StObject.set(x, "get_cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_cancel(value: Boolean => Unit): Self = StObject.set(x, "set_cancel", js.Any.fromFunction1(value))
  }
}
