package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.anon.Compiler
import typingsSlinky.angularCompiler.anon.ResourceNameToFileName
import typingsSlinky.angularCompiler.compilerHostMod.AotCompilerHost
import typingsSlinky.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typingsSlinky.angularCompiler.urlResolverMod.UrlResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler_factory", JSImport.Namespace)
@js.native
object compilerFactoryMod extends js.Object {
  def createAotCompiler(compilerHost: AotCompilerHost, options: AotCompilerOptions): Compiler = js.native
  def createAotCompiler(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): Compiler = js.native
  def createAotUrlResolver(host: ResourceNameToFileName): UrlResolver = js.native
}

