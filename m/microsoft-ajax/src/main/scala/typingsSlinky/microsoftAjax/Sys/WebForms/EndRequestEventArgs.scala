package typingsSlinky.microsoftAjax.Sys.WebForms

import typingsSlinky.microsoftAjax.Sys.EventArgs
import typingsSlinky.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the endRequest event of the PageRequestManager class to pass argument information to event handlers.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397499.aspx}
  */
@js.native
trait EndRequestEventArgs extends EventArgs {
  //#endregion
  //#region Properties
  /**
    * Gets a JSON data structure that contains data items that were registered by using the RegisterDataItem method of the ScriptManager class.
    * The JavaScript Error object exposes several properties that define the error. The Microsoft Ajax Library provides additional functions for the Error object.
    * @return A JSON data structure that contains name/value pairs that were registered as data items by using the RegisterDataItem method of the ScriptManager class.
    */
  def get_dataItems(): js.Any = js.native
  /**
    * Gets the Error object.
    * @return A base ECMAScript (JavaScript) Error object.
    */
  def get_error(): js.Error = js.native
  /**
    * Get or sets a value that indicates whether the error has been handled.
    * Use this property to determine whether an asynchronous postback error has already been handled. If it has not and if you want to take action on the error, you can set the error as handled.
    * @return true if the error has been handled; otherwise false.
    */
  def get_errorHandled(): Boolean = js.native
  /**
    * Gets a response object that is represented by the Sys.Net.WebRequestExecutor class.
    * @return A response object that is represented by the WebRequestExecutor class.
    */
  def get_response(): WebRequestExecutor = js.native
  /**
    * Get or sets a value that indicates whether the error has been handled.
    * Use this property to determine whether an asynchronous postback error has already been handled. If it has not and if you want to take action on the error, you can set the error as handled.
    * @param value
    *         true or false.
    */
  def set_errorHandled(value: Boolean): Unit = js.native
}

object EndRequestEventArgs {
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_dataItems: () => js.Any,
    get_error: () => js.Error,
    get_errorHandled: () => Boolean,
    get_response: () => WebRequestExecutor,
    set_errorHandled: Boolean => Unit
  ): EndRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_dataItems = js.Any.fromFunction0(get_dataItems), get_error = js.Any.fromFunction0(get_error), get_errorHandled = js.Any.fromFunction0(get_errorHandled), get_response = js.Any.fromFunction0(get_response), set_errorHandled = js.Any.fromFunction1(set_errorHandled))
    __obj.asInstanceOf[EndRequestEventArgs]
  }
  @scala.inline
  implicit class EndRequestEventArgsOps[Self <: EndRequestEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_dataItems(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_dataItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_error(value: () => js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_error")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_errorHandled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errorHandled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_response(value: () => WebRequestExecutor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_response")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_errorHandled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_errorHandled")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

