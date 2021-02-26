package typingsSlinky.nodeRedEditorClient.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.nodeRedEditorClient.mod.global.JQuery
import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Align extends StObject {
  
  var align: js.UndefOr[left | right] = js.native
  
  var element: JQuery[HTMLElement] = js.native
  
  var id: String = js.native
}
object Align {
  
  @scala.inline
  def apply(element: JQuery[HTMLElement], id: String): Align = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setElement(value: JQuery[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
