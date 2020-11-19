package typingsSlinky.jestResolve

import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-resolve/build/defaultResolver", JSImport.Namespace)
@js.native
object defaultResolverMod extends js.Object {
  
  def clearDefaultResolverCache(): Unit = js.native
  
  def default(path: Path, options: ResolverOptions): Path = js.native
  
  @js.native
  trait ResolverOptions extends js.Object {
    
    var basedir: Path = js.native
    
    var browser: js.UndefOr[Boolean] = js.native
    
    def defaultResolver(path: Path, options: this.type): Path = js.native
    @JSName("defaultResolver")
    var defaultResolver_Original: js.Function2[/* path */ Path, /* options */ this.type, Path] = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    var moduleDirectory: js.UndefOr[js.Array[String]] = js.native
    
    var paths: js.UndefOr[js.Array[Path]] = js.native
    
    var rootDir: js.UndefOr[Path] = js.native
  }
}
