package typingsSlinky.angularCompiler.lazyRoutesMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/lazy_routes", "listLazyRoutes")
@js.native
object listLazyRoutes extends js.Object {
  
  def apply(moduleMeta: CompileNgModuleMetadata, reflector: StaticReflector): js.Array[LazyRoute] = js.native
}
