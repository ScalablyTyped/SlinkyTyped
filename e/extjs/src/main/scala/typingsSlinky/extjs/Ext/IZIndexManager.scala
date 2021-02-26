package typingsSlinky.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IZIndexManager extends IBase {
  
  /** [Method] Brings the specified Component to the front of any other active Components in this ZIndexManager
    * @param comp String/Object The id of the Component or a Ext.Component instance
    * @returns Boolean True if the dialog was brought to the front, else false if it was already in front
    */
  var bringToFront: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  var eachBottomUp: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
    * @param fn Function The function to execute for each item
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
    */
  var eachTopDown: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Gets a registered Component by id
    * @param id String/Object The id of the Component or a Ext.Component instance
    * @returns Ext.Component
    */
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IComponent]] = js.native
  
  /** [Method] Gets the currently active Component in this ZIndexManager
    * @returns Ext.Component The active Component
    */
  var getActive: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Returns zero or more Components in this ZIndexManager using the custom search function passed to this method
    * @param fn Function The search function
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component being tested. That gets passed to the function if not specified.
    * @returns Array An array of zero or more matching windows
    */
  var getBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Array]] = js.native
  
  /** [Method] Hides all Components managed by this ZIndexManager  */
  var hideAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Registers a floating Ext Component with this ZIndexManager
    * @param comp Ext.Component The Component to register.
    */
  var register: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.native
  
  /** [Method] Sends the specified Component to the back of other active Components in this ZIndexManager
    * @param comp String/Object The id of the Component or a Ext.Component instance
    * @returns Ext.Component The Component
    */
  var sendToBack: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.native
  
  /** [Method] Unregisters a Ext Component from this ZIndexManager
    * @param comp Ext.Component The Component to unregister.
    */
  var unregister: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.native
}
object IZIndexManager {
  
  @scala.inline
  def apply(): IZIndexManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IZIndexManager]
  }
  
  @scala.inline
  implicit class IZIndexManagerMutableBuilder[Self <: IZIndexManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBringToFront(value: /* comp */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "bringToFront", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBringToFrontUndefined: Self = StObject.set(x, "bringToFront", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachBottomUp(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachBottomUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachBottomUpUndefined: Self = StObject.set(x, "eachBottomUp", js.undefined)
    
    @scala.inline
    def setEachTopDown(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachTopDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachTopDownUndefined: Self = StObject.set(x, "eachTopDown", js.undefined)
    
    @scala.inline
    def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    @scala.inline
    def setGet(value: /* id */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetActive(value: () => IComponent): Self = StObject.set(x, "getActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
    
    @scala.inline
    def setGetBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "getBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetByUndefined: Self = StObject.set(x, "getBy", js.undefined)
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideAllUndefined: Self = StObject.set(x, "hideAll", js.undefined)
    
    @scala.inline
    def setRegister(value: /* comp */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    
    @scala.inline
    def setSendToBack(value: /* comp */ js.UndefOr[js.Any] => IComponent): Self = StObject.set(x, "sendToBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendToBackUndefined: Self = StObject.set(x, "sendToBack", js.undefined)
    
    @scala.inline
    def setUnregister(value: /* comp */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterUndefined: Self = StObject.set(x, "unregister", js.undefined)
  }
}
