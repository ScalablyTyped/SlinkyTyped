package typingsSlinky.angularCore

import typingsSlinky.std.Set
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.ImportSpecifier
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/wait-for-async/util", JSImport.Namespace)
@js.native
object waitForAsyncUtilMod extends js.Object {
  
  def findAsyncReferences(sourceFile: SourceFile, typeChecker: TypeChecker, asyncImportSpecifier: ImportSpecifier): Set[Identifier] = js.native
}
