package typingsSlinky.appBuilderLib.cacheManagerMod

import typingsSlinky.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/util/cacheManager", "BuildCacheManager")
@js.native
class BuildCacheManager protected () extends js.Object {
  def this(outDir: String, executableFile: String, arch: Arch) = this()
  
  val cacheDir: String = js.native
  
  val cacheFile: String = js.native
  
  var cacheInfo: BuildCacheInfo | Null = js.native
  
  val cacheInfoFile: String = js.native
  
  def copyIfValid(digest: String): js.Promise[Boolean] = js.native
  
  val executableFile: js.Any = js.native
  
  var newDigest: js.Any = js.native
  
  def save(): js.Promise[Unit] = js.native
}
/* static members */
@JSImport("app-builder-lib/out/util/cacheManager", "BuildCacheManager")
@js.native
object BuildCacheManager extends js.Object {
  
  var VERSION: String = js.native
}
