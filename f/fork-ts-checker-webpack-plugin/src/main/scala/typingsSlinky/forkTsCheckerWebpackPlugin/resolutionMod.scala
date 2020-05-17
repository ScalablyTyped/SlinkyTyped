package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.anon.Typeofts
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.ModuleResolutionHost
import typingsSlinky.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsSlinky.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/resolution", JSImport.Namespace)
@js.native
object resolutionMod extends js.Object {
  def makeResolutionFunctions(): typingsSlinky.forkTsCheckerWebpackPlugin.anon.ResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName): typingsSlinky.forkTsCheckerWebpackPlugin.anon.ResolveModuleName = js.native
  def makeResolutionFunctions(resolveModuleName: ResolveModuleName, resolveTypeReferenceDirective: ResolveTypeReferenceDirective): typingsSlinky.forkTsCheckerWebpackPlugin.anon.ResolveModuleName = js.native
  type ResolveModuleName = js.Function5[
    /* typescript */ Typeofts, 
    /* moduleName */ String, 
    /* containingFile */ String, 
    /* compilerOptions */ CompilerOptions, 
    /* moduleResolutionHost */ ModuleResolutionHost, 
    ResolvedModuleWithFailedLookupLocations
  ]
  type ResolveTypeReferenceDirective = js.Function5[
    /* typescript */ Typeofts, 
    /* typeDirectiveName */ String, 
    /* containingFile */ String, 
    /* compilerOptions */ CompilerOptions, 
    /* moduleResolutionHost */ ModuleResolutionHost, 
    ResolvedTypeReferenceDirectiveWithFailedLookupLocations
  ]
}

