package typingsSlinky.cacache.enMod.get

import typingsSlinky.cacache.enMod.CacheObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cacache/en", "get.copy")
@js.native
object copy extends js.Object {
  
  def apply(cachePath: String, key: String, dest: String): js.Promise[CacheObject] = js.native
  def apply(cachePath: String, key: String, dest: String, opts: Options): js.Promise[CacheObject] = js.native
  
  def byDigest(cachePath: String, hash: String, dest: String): js.Promise[String] = js.native
  def byDigest(cachePath: String, hash: String, dest: String, opts: Options): js.Promise[String] = js.native
}
