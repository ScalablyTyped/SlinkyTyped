package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.footnote_anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait FootnoteAnchorToken extends FootnoteGenericToken {
  
  @JSName("type")
  var type_FootnoteAnchorToken: footnote_anchor = js.native
}
object FootnoteAnchorToken {
  
  @scala.inline
  def apply(id: Double, level: Double, `type`: footnote_anchor): FootnoteAnchorToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteAnchorToken]
  }
  
  @scala.inline
  implicit class FootnoteAnchorTokenOps[Self <: FootnoteAnchorToken] (val x: Self) extends AnyVal {
    
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
    def setType(value: footnote_anchor): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
