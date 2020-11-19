package typingsSlinky.jointjs.mod.shapes.standard

import typingsSlinky.jointjs.anon.Style
import typingsSlinky.jointjs.mod.attributes.SVGAttributes
import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBlockSelectors extends js.Object {
  
  var body: js.UndefOr[SVGRectAttributes] = js.native
  
  var label: js.UndefOr[Style] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
}
object TextBlockSelectors {
  
  @scala.inline
  def apply(): TextBlockSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextBlockSelectors]
  }
  
  @scala.inline
  implicit class TextBlockSelectorsOps[Self <: TextBlockSelectors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: SVGRectAttributes): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setLabel(value: Style): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
