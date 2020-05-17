package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.anon.Compiler
import typingsSlinky.angularCompiler.compilerHostMod.AotCompilerHost
import typingsSlinky.angularCompiler.compilerOptionsMod.AotCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "createAotCompiler")
@js.native
object createAotCompiler extends js.Object {
  def apply(compilerHost: AotCompilerHost, options: AotCompilerOptions): Compiler = js.native
  def apply(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): Compiler = js.native
}

