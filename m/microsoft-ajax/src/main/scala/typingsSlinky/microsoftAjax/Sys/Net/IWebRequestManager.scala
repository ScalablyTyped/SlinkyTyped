package typingsSlinky.microsoftAjax.Sys.Net

import typingsSlinky.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages the flow of the Web requests issued by the Sys.Net.WebRequest object to the associated executor object.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397435(v=vs.100).aspx}
  */
@js.native
trait IWebRequestManager extends js.Object {
  
  //#endregion
  //#region Methods
  /**
    * Registers a handler for the completed request event of the WebRequestManager.
    * @param handler
    *      The function registered to handle the completed request event.
    */
  def add_completedRequest(handler: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit]): Unit = js.native
  
  /**
    * Registers a handler for processing the invoking request event of the WebRequestManager.
    * @param handler
    *      The function registered to handle the invoking request event.
    */
  def add_invokingRequest(
    handler: js.Function2[
      /* sender */ WebRequestExecutor, 
      /* networkRequestEventArgs */ NetworkRequestEventArgs, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Sends Web requests to the default network executor.
    * This member supports the client-script infrastructure and is not intended to be used directly from your code.
    * @param WebRequest
    *      An instance of the Sys.Net.WebRequest class.
    */
  def executeRequest(WebRequest: WebRequest): Unit = js.native
  
  //#endregion
  //#region Properties
  /**
    * Gets or sets the default network executor type that is used to make network requests.
    * @return
    *      The object that represents the default Web request executor.
    */
  def get_defaultExecutorType(): WebRequestExecutor = js.native
  
  /**
    * Gets or sets the time-out for the default network executor.
    * @return
    *      An integer value that indicates the current time-out for the default executor.
    */
  def get_defaultTimeout(): Double = js.native
  
  /**
    * Removes the event handler set by the add_completedRequest method.
    * Use the remove_ completedRequest method to remove the event handler you set using the add_ completedRequest method.
    * @param handler
    *      The function that handles the completed request event.
    */
  def remove_completedRequest(handler: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit]): Unit = js.native
  
  /**
    * Removes the event handler set by the add_invokingRequest method.
    * Use the remove_invokingRequest method to remove the event handler you set using the add_invokingRequest method.
    * @param handler
    *          The function that handles the invoking request event.
    */
  def remove_invokingRequest(
    handler: js.Function2[
      /* sender */ WebRequestExecutor, 
      /* networkRequestEventArgs */ NetworkRequestEventArgs, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Gets or sets the default network executor type that is used to make network requests.
    * @param value
    *          A reference to an implementation of the WebRequestExecutor class.
    */
  def set_defaultExecutorType(value: WebRequestExecutor): Unit = js.native
  
  /**
    * Gets or sets the time-out for the default network executor.
    *
    * @throws Sys.ArgumentOutOfRangeException An invalid parameter was passed.
    * @param value
    *          The time in milliseconds that the default executor should wait before timing out a Web request. This value must be 0 or a positive integer.
    */
  def set_defaultTimeout(value: Double): Unit = js.native
}
object IWebRequestManager {
  
  @scala.inline
  def apply(
    add_completedRequest: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit] => Unit,
    add_invokingRequest: js.Function2[
      /* sender */ WebRequestExecutor, 
      /* networkRequestEventArgs */ NetworkRequestEventArgs, 
      Unit
    ] => Unit,
    executeRequest: WebRequest => Unit,
    get_defaultExecutorType: () => WebRequestExecutor,
    get_defaultTimeout: () => Double,
    remove_completedRequest: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit] => Unit,
    remove_invokingRequest: js.Function2[
      /* sender */ WebRequestExecutor, 
      /* networkRequestEventArgs */ NetworkRequestEventArgs, 
      Unit
    ] => Unit,
    set_defaultExecutorType: WebRequestExecutor => Unit,
    set_defaultTimeout: Double => Unit
  ): IWebRequestManager = {
    val __obj = js.Dynamic.literal(add_completedRequest = js.Any.fromFunction1(add_completedRequest), add_invokingRequest = js.Any.fromFunction1(add_invokingRequest), executeRequest = js.Any.fromFunction1(executeRequest), get_defaultExecutorType = js.Any.fromFunction0(get_defaultExecutorType), get_defaultTimeout = js.Any.fromFunction0(get_defaultTimeout), remove_completedRequest = js.Any.fromFunction1(remove_completedRequest), remove_invokingRequest = js.Any.fromFunction1(remove_invokingRequest), set_defaultExecutorType = js.Any.fromFunction1(set_defaultExecutorType), set_defaultTimeout = js.Any.fromFunction1(set_defaultTimeout))
    __obj.asInstanceOf[IWebRequestManager]
  }
  
  @scala.inline
  implicit class IWebRequestManagerOps[Self <: IWebRequestManager] (val x: Self) extends AnyVal {
    
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
    def setAdd_completedRequest(value: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit] => Unit): Self = this.set("add_completedRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd_invokingRequest(
      value: js.Function2[
          /* sender */ WebRequestExecutor, 
          /* networkRequestEventArgs */ NetworkRequestEventArgs, 
          Unit
        ] => Unit
    ): Self = this.set("add_invokingRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteRequest(value: WebRequest => Unit): Self = this.set("executeRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_defaultExecutorType(value: () => WebRequestExecutor): Self = this.set("get_defaultExecutorType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_defaultTimeout(value: () => Double): Self = this.set("get_defaultTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove_completedRequest(value: js.Function2[/* sender */ WebRequestExecutor, /* eventArgs */ EventArgs, Unit] => Unit): Self = this.set("remove_completedRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove_invokingRequest(
      value: js.Function2[
          /* sender */ WebRequestExecutor, 
          /* networkRequestEventArgs */ NetworkRequestEventArgs, 
          Unit
        ] => Unit
    ): Self = this.set("remove_invokingRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_defaultExecutorType(value: WebRequestExecutor => Unit): Self = this.set("set_defaultExecutorType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_defaultTimeout(value: Double => Unit): Self = this.set("set_defaultTimeout", js.Any.fromFunction1(value))
  }
}
