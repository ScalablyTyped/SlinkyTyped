package typingsSlinky.nodeRedEditorClient.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.nodeRedEditorClient.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fill extends StObject {
  
  var container: JQuery[HTMLElement] = js.native
  
  var fill: js.UndefOr[Boolean] = js.native
  
  var singleExpanded: js.UndefOr[Boolean] = js.native
}
object Fill {
  
  @scala.inline
  def apply(container: JQuery[HTMLElement]): Fill = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  
  @scala.inline
  implicit class FillMutableBuilder[Self <: Fill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setSingleExpanded(value: Boolean): Self = StObject.set(x, "singleExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleExpandedUndefined: Self = StObject.set(x, "singleExpanded", js.undefined)
  }
}
