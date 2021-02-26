package typingsSlinky.jpm.anon

import typingsSlinky.jpm.toolbarMod.Toolbar
import typingsSlinky.jpm.toolbarMod.ToolbarItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hidden extends StObject {
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var items: js.Array[ToolbarItem] = js.native
  
  var onAttach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  
  var onDetach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  
  var onShow: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  
  var title: String = js.native
}
object Hidden {
  
  @scala.inline
  def apply(items: js.Array[ToolbarItem], title: String): Hidden = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
  
  @scala.inline
  implicit class HiddenMutableBuilder[Self <: Hidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ToolbarItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOnAttach(value: /* toolbar */ Toolbar => _): Self = StObject.set(x, "onAttach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAttachUndefined: Self = StObject.set(x, "onAttach", js.undefined)
    
    @scala.inline
    def setOnDetach(value: /* toolbar */ Toolbar => _): Self = StObject.set(x, "onDetach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDetachUndefined: Self = StObject.set(x, "onDetach", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* toolbar */ Toolbar => _): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* toolbar */ Toolbar => _): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
