package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbsoluteLayout extends IAnchor {
  
  /** [Config Option] (Boolean) */
  var ignoreOnContentChange: js.UndefOr[Boolean] = js.native
  
  /** [Method] This method is called when a child item changes in some way
    * @returns Boolean True if this layout has handled the content change.
    */
  @JSName("onContentChange")
  var onContentChange_IAbsoluteLayout: js.UndefOr[js.Function0[Boolean]] = js.native
}
object IAbsoluteLayout {
  
  @scala.inline
  def apply(): IAbsoluteLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbsoluteLayout]
  }
  
  @scala.inline
  implicit class IAbsoluteLayoutMutableBuilder[Self <: IAbsoluteLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreOnContentChange(value: Boolean): Self = StObject.set(x, "ignoreOnContentChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreOnContentChangeUndefined: Self = StObject.set(x, "ignoreOnContentChange", js.undefined)
    
    @scala.inline
    def setOnContentChange(value: () => Boolean): Self = StObject.set(x, "onContentChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnContentChangeUndefined: Self = StObject.set(x, "onContentChange", js.undefined)
  }
}
