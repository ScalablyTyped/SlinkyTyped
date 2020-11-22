package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.TSIndexedAccessType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSIndexedAccessType_
  extends TSType
     with BaseNode {
  
  var indexType: TSType = js.native
  
  var objectType: TSType = js.native
  
  @JSName("type")
  var type_TSIndexedAccessType_ : TSIndexedAccessType = js.native
}
object TSIndexedAccessType_ {
  
  @scala.inline
  def apply(indexType: TSType, objectType: TSType, `type`: TSIndexedAccessType): TSIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSIndexedAccessType_]
  }
  
  @scala.inline
  implicit class TSIndexedAccessType_Ops[Self <: TSIndexedAccessType_] (val x: Self) extends AnyVal {
    
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
    def setIndexType(value: TSType): Self = this.set("indexType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: TSType): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSIndexedAccessType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
