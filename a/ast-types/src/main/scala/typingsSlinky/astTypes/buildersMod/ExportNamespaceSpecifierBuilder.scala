package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsExported
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportNamespaceSpecifierBuilder extends js.Object {
  
  def apply(exported: IdentifierKind): ExportNamespaceSpecifier = js.native
  
  def from(params: CommentsExported): ExportNamespaceSpecifier = js.native
}
