package typingsSlinky.angularCore

import typingsSlinky.angularCore.anon.Host
import typingsSlinky.typescript.mod.CompilerHost
import typingsSlinky.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/utils/typescript/compiler_host", JSImport.Namespace)
@js.native
object compilerHostMod extends js.Object {
  
  def createMigrationCompilerHost(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    options: CompilerOptions,
    basePath: String
  ): CompilerHost = js.native
  def createMigrationCompilerHost(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    options: CompilerOptions,
    basePath: String,
    fakeRead: FakeReadFileFn
  ): CompilerHost = js.native
  
  def createMigrationProgram(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    tsconfigPath: String,
    basePath: String
  ): Host = js.native
  def createMigrationProgram(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    tsconfigPath: String,
    basePath: String,
    fakeFileRead: js.UndefOr[scala.Nothing],
    additionalFiles: js.Array[String]
  ): Host = js.native
  def createMigrationProgram(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    tsconfigPath: String,
    basePath: String,
    fakeFileRead: FakeReadFileFn
  ): Host = js.native
  def createMigrationProgram(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ js.Any,
    tsconfigPath: String,
    basePath: String,
    fakeFileRead: FakeReadFileFn,
    additionalFiles: js.Array[String]
  ): Host = js.native
  
  type FakeReadFileFn = js.Function1[/* fileName */ String, String | Null]
}
