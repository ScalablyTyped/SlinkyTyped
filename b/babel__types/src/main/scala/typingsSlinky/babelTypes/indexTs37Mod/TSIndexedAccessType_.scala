package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.TSIndexedAccessType
import org.scalablytyped.runtime.StObject
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
  implicit class TSIndexedAccessType_MutableBuilder[Self <: TSIndexedAccessType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexType(value: TSType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: TSType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
