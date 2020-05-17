package typingsSlinky.angularCore

import typingsSlinky.angularCore.anon.Node
import typingsSlinky.typescript.mod.CallExpression
import typingsSlinky.typescript.mod.NamedImports
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/migrations/renderer-to-renderer2/migration", JSImport.Namespace)
@js.native
object migrationMod extends js.Object {
  def migrateExpression(node: CallExpression, typeChecker: TypeChecker): Node = js.native
  def replaceImport(node: NamedImports, oldImport: String, newImport: String): NamedImports = js.native
}

