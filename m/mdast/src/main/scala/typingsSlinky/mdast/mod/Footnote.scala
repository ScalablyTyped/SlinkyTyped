package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastStrings.footnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Footnote
  extends Parent
     with StaticPhrasingContent {
  
  @JSName("children")
  var children_Footnote: js.Array[PhrasingContent] = js.native
  
  @JSName("type")
  var type_Footnote: footnote = js.native
}
object Footnote {
  
  @scala.inline
  def apply(children: js.Array[PhrasingContent], `type`: footnote): Footnote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footnote]
  }
  
  @scala.inline
  implicit class FootnoteOps[Self <: Footnote] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: PhrasingContent*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[PhrasingContent]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: footnote): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
