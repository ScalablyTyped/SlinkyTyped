package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.TSNullKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSNullKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  @JSName("type")
  var type_TSNullKeyword_ : TSNullKeyword = js.native
}
object TSNullKeyword_ {
  
  @scala.inline
  def apply(`type`: TSNullKeyword): TSNullKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSNullKeyword_]
  }
  
  @scala.inline
  implicit class TSNullKeyword_MutableBuilder[Self <: TSNullKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNullKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
