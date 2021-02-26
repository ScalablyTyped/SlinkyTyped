package typingsSlinky.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menuitemexportlibrary extends StObject {
  
  var `menu-item-export-library`: js.UndefOr[Boolean] = js.native
  
  var `menu-item-help`: js.UndefOr[Url] = js.native
  
  var `menu-item-import-library`: js.UndefOr[Boolean] = js.native
  
  var `menu-item-keyboard-shortcuts`: js.UndefOr[Boolean] = js.native
}
object Menuitemexportlibrary {
  
  @scala.inline
  def apply(): Menuitemexportlibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Menuitemexportlibrary]
  }
  
  @scala.inline
  implicit class MenuitemexportlibraryMutableBuilder[Self <: Menuitemexportlibrary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setMenu-item-export-library`(value: Boolean): Self = StObject.set(x, "menu-item-export-library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMenu-item-export-libraryUndefined`: Self = StObject.set(x, "menu-item-export-library", js.undefined)
    
    @scala.inline
    def `setMenu-item-help`(value: Url): Self = StObject.set(x, "menu-item-help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMenu-item-helpUndefined`: Self = StObject.set(x, "menu-item-help", js.undefined)
    
    @scala.inline
    def `setMenu-item-import-library`(value: Boolean): Self = StObject.set(x, "menu-item-import-library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMenu-item-import-libraryUndefined`: Self = StObject.set(x, "menu-item-import-library", js.undefined)
    
    @scala.inline
    def `setMenu-item-keyboard-shortcuts`(value: Boolean): Self = StObject.set(x, "menu-item-keyboard-shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMenu-item-keyboard-shortcutsUndefined`: Self = StObject.set(x, "menu-item-keyboard-shortcuts", js.undefined)
  }
}
