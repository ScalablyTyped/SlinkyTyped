package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElementContainer extends IBase {
  
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
    * @param testFn Function The test function.
    */
  var removeChildEls: js.UndefOr[js.Function1[/* testFn */ js.UndefOr[js.Any], Unit]] = js.native
}
object IElementContainer {
  
  @scala.inline
  def apply(): IElementContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementContainer]
  }
  
  @scala.inline
  implicit class IElementContainerMutableBuilder[Self <: IElementContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddChildEls(value: () => Unit): Self = StObject.set(x, "addChildEls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddChildElsUndefined: Self = StObject.set(x, "addChildEls", js.undefined)
    
    @scala.inline
    def setRemoveChildEls(value: /* testFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "removeChildEls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveChildElsUndefined: Self = StObject.set(x, "removeChildEls", js.undefined)
  }
}
