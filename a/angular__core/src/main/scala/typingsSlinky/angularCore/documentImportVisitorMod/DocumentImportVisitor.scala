package typingsSlinky.angularCore.documentImportVisitorMod

import typingsSlinky.std.Map
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/move-document/document_import_visitor", "DocumentImportVisitor")
@js.native
class DocumentImportVisitor protected () extends js.Object {
  def this(typeChecker: TypeChecker) = this()
  
  var getDocumentElement: js.Any = js.native
  
  var importsMap: Map[SourceFile, ResolvedDocumentImport] = js.native
  
  var typeChecker: TypeChecker = js.native
  
  var visitNamedImport: js.Any = js.native
  
  def visitNode(node: Node): Unit = js.native
}
