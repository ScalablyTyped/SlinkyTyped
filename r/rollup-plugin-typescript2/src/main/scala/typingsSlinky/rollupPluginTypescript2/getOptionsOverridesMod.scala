package typingsSlinky.rollupPluginTypescript2

import typingsSlinky.rollupPluginTypescript2.contextMod.IContext
import typingsSlinky.rollupPluginTypescript2.ioptionsMod.IOptions
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/get-options-overrides", JSImport.Namespace)
@js.native
object getOptionsOverridesMod extends js.Object {
  def createFilter(context: IContext, pluginOptions: IOptions, parsedConfig: ParsedCommandLine): js.Any = js.native
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRootCwd: IOptions): CompilerOptions = js.native
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRootCwd: IOptions, preParsedTsconfig: ParsedCommandLine): CompilerOptions = js.native
}

