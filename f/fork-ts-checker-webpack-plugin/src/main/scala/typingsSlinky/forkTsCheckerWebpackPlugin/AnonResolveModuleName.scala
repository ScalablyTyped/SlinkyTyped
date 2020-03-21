package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.resolutionMod.ResolveModuleName
import typingsSlinky.forkTsCheckerWebpackPlugin.resolutionMod.ResolveTypeReferenceDirective
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ModuleResolutionHost
import typingsSlinky.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsSlinky.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResolveModuleName extends js.Object {
  @JSName("resolveModuleName")
  var resolveModuleName_Original: ResolveModuleName = js.native
  @JSName("resolveTypeReferenceDirective")
  var resolveTypeReferenceDirective_Original: ResolveTypeReferenceDirective = js.native
  def resolveModuleName(
    typescript: Typeofts,
    moduleName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typescript: Typeofts,
    typeDirectiveName: String,
    containingFile: String,
    compilerOptions: CompilerOptions,
    moduleResolutionHost: ModuleResolutionHost
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
}

