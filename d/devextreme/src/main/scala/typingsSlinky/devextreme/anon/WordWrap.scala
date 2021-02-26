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
trait WordWrap extends StObject {
  
  var font: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.viz.Font] = js.native
  
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}
object WordWrap {
  
  @scala.inline
  def apply(): WordWrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordWrap]
  }
  
  @scala.inline
  implicit class WordWrapMutableBuilder[Self <: WordWrap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: typingsSlinky.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
