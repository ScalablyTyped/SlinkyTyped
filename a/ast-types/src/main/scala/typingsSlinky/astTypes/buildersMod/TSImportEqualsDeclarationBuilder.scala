package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonIsExport
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSImportEqualsDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, moduleReference: IdentifierKind): TSImportEqualsDeclaration = js.native
  def apply(id: IdentifierKind, moduleReference: TSExternalModuleReferenceKind): TSImportEqualsDeclaration = js.native
  def apply(id: IdentifierKind, moduleReference: TSQualifiedNameKind): TSImportEqualsDeclaration = js.native
  def from(params: AnonIsExport): TSImportEqualsDeclaration = js.native
}

