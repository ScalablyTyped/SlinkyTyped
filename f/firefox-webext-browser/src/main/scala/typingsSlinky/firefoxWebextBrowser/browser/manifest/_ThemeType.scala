package typingsSlinky.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _ThemeType extends StObject {
  
  var additional_backgrounds_alignment: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsAlignment]] = js.native
  
  var additional_backgrounds_tiling: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsTiling]] = js.native
}
object _ThemeType {
  
  @scala.inline
  def apply(): _ThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ThemeType]
  }
  
  @scala.inline
  implicit class _ThemeTypeMutableBuilder[Self <: _ThemeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional_backgrounds_alignment(value: js.Array[ThemeTypeAdditionalBackgroundsAlignment]): Self = StObject.set(x, "additional_backgrounds_alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_backgrounds_alignmentUndefined: Self = StObject.set(x, "additional_backgrounds_alignment", js.undefined)
    
    @scala.inline
    def setAdditional_backgrounds_alignmentVarargs(value: ThemeTypeAdditionalBackgroundsAlignment*): Self = StObject.set(x, "additional_backgrounds_alignment", js.Array(value :_*))
    
    @scala.inline
    def setAdditional_backgrounds_tiling(value: js.Array[ThemeTypeAdditionalBackgroundsTiling]): Self = StObject.set(x, "additional_backgrounds_tiling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_backgrounds_tilingUndefined: Self = StObject.set(x, "additional_backgrounds_tiling", js.undefined)
    
    @scala.inline
    def setAdditional_backgrounds_tilingVarargs(value: ThemeTypeAdditionalBackgroundsTiling*): Self = StObject.set(x, "additional_backgrounds_tiling", js.Array(value :_*))
  }
}
