package typingsSlinky.jestResolve.mod

import typingsSlinky.jestHasteMap.mod.ModuleMap
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
  
  def clearDefaultResolverCache(): Unit = js.native
  
  def findNodeModule(path: Path, options: FindNodeModuleConfig): Path | Null = js.native
}
