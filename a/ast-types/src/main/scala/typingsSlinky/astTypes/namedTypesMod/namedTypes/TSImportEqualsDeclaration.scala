package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
@js.native
trait TSImportEqualsDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var id: IdentifierKind = js.native
  
  var isExport: js.UndefOr[Boolean] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSImportEqualsDeclaration = js.native
}
object TSImportEqualsDeclaration {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSImportEqualsDeclaration")
  @js.native
  val ^ : Type[TSImportEqualsDeclaration] = js.native
  
  @scala.inline
  implicit class TSImportEqualsDeclarationMutableBuilder[Self <: TSImportEqualsDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExport(value: Boolean): Self = StObject.set(x, "isExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExportUndefined: Self = StObject.set(x, "isExport", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setModuleReference(value: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind): Self = StObject.set(x, "moduleReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.TSImportEqualsDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
