package typingsSlinky.jestDashResolve.jestDashResolveMod

import typingsSlinky.atJestTypes.buildConfigMod.Path
import typingsSlinky.jestDashHasteDashMap.jestDashHasteDashMapMod.ModuleMap
import typingsSlinky.jestDashResolve.buildTypesMod.ResolverConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

