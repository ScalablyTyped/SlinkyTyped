package typingsSlinky.jointjs.anon

import typingsSlinky.jointjs.mod.dia.Element.PositionType
import typingsSlinky.jointjs.mod.dia.MarkupJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Markup extends js.Object {
  
  var markup: js.UndefOr[String | MarkupJSON] = js.native
  
  var position: js.UndefOr[PositionType] = js.native
}
object Markup {
  
  @scala.inline
  def apply(): Markup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Markup]
  }
  
  @scala.inline
  implicit class MarkupOps[Self <: Markup] (val x: Self) extends AnyVal {
    
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
    def setMarkup(value: String | MarkupJSON): Self = this.set("markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkup: Self = this.set("markup", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
