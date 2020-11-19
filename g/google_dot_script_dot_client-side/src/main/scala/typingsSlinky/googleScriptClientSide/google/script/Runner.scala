package typingsSlinky.googleScriptClientSide.google.script

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Runner
  extends /**
  * Executes the server-side Apps Script function with the corresponding name.
  */
/* functionName */ StringDictionary[
      js.Function2[/* first */ js.UndefOr[Parameter | HTMLFormElement], /* repeated */ Parameter, Unit]
    ] {
  
  /**
    * Sets a callback function to run if the server-side function throws an exception.
    * Without a failure handler, failures are logged to the JavaScript console.
    * To override this, call withFailureHandler(null) or supply a failure handler that does nothing.
    * @param handler a client-side callback function to run if the server-side function throws an exception;
    * the Error object is passed to the function as the first argument, and the user object (if any) is passed as a second argument
    */
  def withFailureHandler(handler: js.Function2[/* error */ js.Error, /* object */ js.UndefOr[js.Any], Unit]): Runner = js.native
  
  /**
    * Sets a callback function to run if the server-side function returns successfully.
    * @param handler a client-side callback function to run if the server-side function returns successfully;
    * the server's return value is passed to the function as the first argument, and the user object (if any) is passed as a second argument
    */
  def withSuccessHandler(handler: js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], Unit]): Runner = js.native
  
  /**
    * Sets an object to pass as a second parameter to the success and failure handlers.
    * @param object an object to pass as a second parameter to the success and failure handlers;
    * because user objects are not sent to the server, they are not subject to the restrictions on parameters and return values for server calls.
    * User objects cannot, however, be objects constructed with the new operator
    */
  def withUserObject(`object`: js.Any): Runner = js.native
}
object Runner {
  
  @scala.inline
  def apply(
    withFailureHandler: js.Function2[/* error */ js.Error, /* object */ js.UndefOr[js.Any], Unit] => Runner,
    withSuccessHandler: js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], Unit] => Runner,
    withUserObject: js.Any => Runner
  ): Runner = {
    val __obj = js.Dynamic.literal(withFailureHandler = js.Any.fromFunction1(withFailureHandler), withSuccessHandler = js.Any.fromFunction1(withSuccessHandler), withUserObject = js.Any.fromFunction1(withUserObject))
    __obj.asInstanceOf[Runner]
  }
  
  @scala.inline
  implicit class RunnerOps[Self <: Runner] (val x: Self) extends AnyVal {
    
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
    def setWithFailureHandler(value: js.Function2[/* error */ js.Error, /* object */ js.UndefOr[js.Any], Unit] => Runner): Self = this.set("withFailureHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithSuccessHandler(
      value: js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], Unit] => Runner
    ): Self = this.set("withSuccessHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithUserObject(value: js.Any => Runner): Self = this.set("withUserObject", js.Any.fromFunction1(value))
  }
}
