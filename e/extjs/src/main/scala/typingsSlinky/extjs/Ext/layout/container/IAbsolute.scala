package typingsSlinky.extjs.Ext.layout.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbsolute extends IAnchor {
  
  /** [Config Option] (Boolean) */
  var ignoreOnContentChange: js.UndefOr[Boolean] = js.native
  
  /** [Method] This method is called when a child item changes in some way
    * @returns Boolean True if this layout has handled the content change.
    */
  @JSName("onContentChange")
  var onContentChange_IAbsolute: js.UndefOr[js.Function0[Boolean]] = js.native
}
object IAbsolute {
  
  @scala.inline
  def apply(): IAbsolute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbsolute]
  }
  
  @scala.inline
  implicit class IAbsoluteMutableBuilder[Self <: IAbsolute] (val x: Self) extends AnyVal {
    
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
