package typingsSlinky.angularCore

import typingsSlinky.angularCore.anon.ForwardRefs
import typingsSlinky.typescript.mod.ImportSpecifier
import typingsSlinky.typescript.mod.NamedImports
import typingsSlinky.typescript.mod.NodeArray
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/util", JSImport.Namespace)
@js.native
object rendererToRenderer2UtilMod extends js.Object {
  def findCoreImport(sourceFile: SourceFile, symbolName: String): NamedImports | Null = js.native
  def findImportSpecifier(elements: NodeArray[ImportSpecifier], importName: String): ImportSpecifier | Null = js.native
  def findRendererReferences(sourceFile: SourceFile, typeChecker: TypeChecker, rendererImport: NamedImports): ForwardRefs = js.native
}

