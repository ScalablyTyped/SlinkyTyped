package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.`type`
import typingsSlinky.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait DeclareExportAllDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var exportKind: `type` | value | Null = js.native
  
  var source: StringLiteral_ = js.native
  
  @JSName("type")
  var type_DeclareExportAllDeclaration_ : DeclareExportAllDeclaration = js.native
}
object DeclareExportAllDeclaration_ {
  
  @scala.inline
  def apply(source: StringLiteral_, `type`: DeclareExportAllDeclaration): DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportAllDeclaration_]
  }
  
  @scala.inline
  implicit class DeclareExportAllDeclaration_MutableBuilder[Self <: DeclareExportAllDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportKind(value: `type` | value): Self = StObject.set(x, "exportKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportKindNull: Self = StObject.set(x, "exportKind", null)
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DeclareExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
