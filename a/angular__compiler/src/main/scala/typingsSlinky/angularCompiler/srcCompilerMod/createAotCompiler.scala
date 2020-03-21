package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.AnonCompiler
import typingsSlinky.angularCompiler.compilerHostMod.AotCompilerHost
import typingsSlinky.angularCompiler.compilerOptionsMod.AotCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "createAotCompiler")
@js.native
object createAotCompiler extends js.Object {
  def apply(compilerHost: AotCompilerHost, options: AotCompilerOptions): AnonCompiler = js.native
  def apply(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): AnonCompiler = js.native
}

