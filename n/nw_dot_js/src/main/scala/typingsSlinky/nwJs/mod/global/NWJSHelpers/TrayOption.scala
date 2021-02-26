package typingsSlinky.nwJs.mod.global.NWJSHelpers

import typingsSlinky.nwJs.mod.global.nw.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Option for tray that contains initial settings for the Tray.
  */
@js.native
trait TrayOption extends StObject {
  
  /**
    * {string} alternate
    */
  var alticon: js.UndefOr[String] = js.native
  
  /**
    * {string} icon
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * {boolean} whether icons are templates
    */
  var iconsAreTemplates: js.UndefOr[Boolean] = js.native
  
  /**
    * {Menu} popup menu
    */
  var menu: js.UndefOr[Menu] = js.native
  
  /**
    * {string} title
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * {string} tooltip
    */
  var tooltip: js.UndefOr[String] = js.native
}
object TrayOption {
  
  @scala.inline
  def apply(): TrayOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrayOption]
  }
  
  @scala.inline
  implicit class TrayOptionMutableBuilder[Self <: TrayOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlticon(value: String): Self = StObject.set(x, "alticon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlticonUndefined: Self = StObject.set(x, "alticon", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIconsAreTemplates(value: Boolean): Self = StObject.set(x, "iconsAreTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsAreTemplatesUndefined: Self = StObject.set(x, "iconsAreTemplates", js.undefined)
    
    @scala.inline
    def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
