package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.breakWord
import typingsSlinky.devextreme.devextremeStrings.ellipsis
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontOffset extends StObject {
  
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}
object FontOffset {
  
  @scala.inline
  def apply(): FontOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontOffset]
  }
  
  @scala.inline
  implicit class FontOffsetMutableBuilder[Self <: FontOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: typingsSlinky.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
