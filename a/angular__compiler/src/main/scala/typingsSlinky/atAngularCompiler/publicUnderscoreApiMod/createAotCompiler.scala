package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.Anon_Compiler
import typingsSlinky.atAngularCompiler.srcAotCompilerUnderscoreHostMod.AotCompilerHost
import typingsSlinky.atAngularCompiler.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "createAotCompiler")
@js.native
object createAotCompiler extends js.Object {
  def apply(compilerHost: AotCompilerHost, options: AotCompilerOptions): Anon_Compiler = js.native
  def apply(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): Anon_Compiler = js.native
}

