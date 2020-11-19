package typingsSlinky.htmlToDraftjs.anon

import typingsSlinky.draftJs.mod.ContentBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentBlocks extends js.Object {
  
  var contentBlocks: js.Array[ContentBlock] = js.native
  
  var entityMap: js.UndefOr[js.Any] = js.native
}
object ContentBlocks {
  
  @scala.inline
  def apply(contentBlocks: js.Array[ContentBlock]): ContentBlocks = {
    val __obj = js.Dynamic.literal(contentBlocks = contentBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentBlocks]
  }
  
  @scala.inline
  implicit class ContentBlocksOps[Self <: ContentBlocks] (val x: Self) extends AnyVal {
    
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
    def setContentBlocksVarargs(value: ContentBlock*): Self = this.set("contentBlocks", js.Array(value :_*))
    
    @scala.inline
    def setContentBlocks(value: js.Array[ContentBlock]): Self = this.set("contentBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMap(value: js.Any): Self = this.set("entityMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityMap: Self = this.set("entityMap", js.undefined)
  }
}
