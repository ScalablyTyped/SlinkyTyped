package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.PipelinePrimaryTopicReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait PipelinePrimaryTopicReference_
  extends Expression
     with BaseNode {
  
  @JSName("type")
  var type_PipelinePrimaryTopicReference_ : PipelinePrimaryTopicReference = js.native
}
object PipelinePrimaryTopicReference_ {
  
  @scala.inline
  def apply(`type`: PipelinePrimaryTopicReference): PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelinePrimaryTopicReference_]
  }
  
  @scala.inline
  implicit class PipelinePrimaryTopicReference_Ops[Self <: PipelinePrimaryTopicReference_] (val x: Self) extends AnyVal {
    
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
    def setType(value: PipelinePrimaryTopicReference): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
