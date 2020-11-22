package typingsSlinky.jestResolve.mod

import typingsSlinky.jestHasteMap.mod.ModuleMap
import typingsSlinky.jestResolve.anon.TypeofModuleNotFoundError
import typingsSlinky.jestResolve.moduleNotFoundErrorMod.default
import typingsSlinky.jestResolve.typesMod.ResolverConfig
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-resolve", JSImport.Namespace)
@js.native
class ^ protected () extends Resolver {
  def this(moduleMap: ModuleMap, options: ResolverConfig) = this()
}
@JSImport("jest-resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var ModuleNotFoundError: TypeofModuleNotFoundError = js.native
  
  def clearDefaultResolverCache(): Unit = js.native
  
  def findNodeModule(path: Path, options: FindNodeModuleConfig): Path | Null = js.native
  
  def tryCastModuleNotFoundError(error: js.Any): default | Null = js.native
  
  def unstable_shouldLoadAsEsm(path: Path): Boolean = js.native
  @JSName("unstable_shouldLoadAsEsm")
  var unstable_shouldLoadAsEsm_Original: js.Function1[/* path */ Path, Boolean] = js.native
}
