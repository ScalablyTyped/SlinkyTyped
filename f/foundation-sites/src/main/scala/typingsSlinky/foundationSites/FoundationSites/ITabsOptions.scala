package typingsSlinky.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITabsOptions extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var linkClass: js.UndefOr[String] = js.native
  
  var matchHeight: js.UndefOr[Boolean] = js.native
  
  var panelClass: js.UndefOr[String] = js.native
  
  var wrapOnKeys: js.UndefOr[Boolean] = js.native
}
object ITabsOptions {
  
  @scala.inline
  def apply(): ITabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabsOptions]
  }
  
  @scala.inline
  implicit class ITabsOptionsMutableBuilder[Self <: ITabsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setLinkClass(value: String): Self = StObject.set(x, "linkClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkClassUndefined: Self = StObject.set(x, "linkClass", js.undefined)
    
    @scala.inline
    def setMatchHeight(value: Boolean): Self = StObject.set(x, "matchHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchHeightUndefined: Self = StObject.set(x, "matchHeight", js.undefined)
    
    @scala.inline
    def setPanelClass(value: String): Self = StObject.set(x, "panelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelClassUndefined: Self = StObject.set(x, "panelClass", js.undefined)
    
    @scala.inline
    def setWrapOnKeys(value: Boolean): Self = StObject.set(x, "wrapOnKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapOnKeysUndefined: Self = StObject.set(x, "wrapOnKeys", js.undefined)
  }
}
