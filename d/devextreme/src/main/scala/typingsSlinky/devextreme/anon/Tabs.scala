package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.collapsed
import typingsSlinky.devextreme.devextremeStrings.disabled
import typingsSlinky.devextreme.devextremeStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tabs extends StObject {
  
  var tabs: js.UndefOr[js.Array[Groups]] = js.native
  
  var visibility: js.UndefOr[auto | visible | collapsed | disabled] = js.native
}
object Tabs {
  
  @scala.inline
  def apply(): Tabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tabs]
  }
  
  @scala.inline
  implicit class TabsMutableBuilder[Self <: Tabs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabs(value: js.Array[Groups]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    @scala.inline
    def setTabsVarargs(value: Groups*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: auto | visible | collapsed | disabled): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
