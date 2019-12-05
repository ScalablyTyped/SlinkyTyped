package typingsSlinky.forkDashTsDashCheckerDashWebpackDashPlugin

import typingsSlinky.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveModuleName
import typingsSlinky.forkDashTsDashCheckerDashWebpackDashPlugin.libResolutionMod.ResolveTypeReferenceDirective
import typingsSlinky.typescript.typescriptMod.CompilerOptions
import typingsSlinky.typescript.typescriptMod.ModuleResolutionHost
import typingsSlinky.typescript.typescriptMod.ResolvedModuleWithFailedLookupLocations
import typingsSlinky.typescript.typescriptMod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ResolveModuleName extends js.Object {
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

