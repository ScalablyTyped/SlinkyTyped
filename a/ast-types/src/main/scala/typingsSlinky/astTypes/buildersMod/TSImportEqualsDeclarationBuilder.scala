package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.IsExport
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSImportEqualsDeclarationBuilder extends StObject {
  
  def apply(id: IdentifierKind, moduleReference: IdentifierKind): TSImportEqualsDeclaration = js.native
  def apply(id: IdentifierKind, moduleReference: TSExternalModuleReferenceKind): TSImportEqualsDeclaration = js.native
  def apply(id: IdentifierKind, moduleReference: TSQualifiedNameKind): TSImportEqualsDeclaration = js.native
  
  def from(params: IsExport): TSImportEqualsDeclaration = js.native
}
