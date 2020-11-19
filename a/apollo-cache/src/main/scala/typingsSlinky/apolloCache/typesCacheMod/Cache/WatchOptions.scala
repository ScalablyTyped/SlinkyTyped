package typingsSlinky.apolloCache.typesCacheMod.Cache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchOptions
  extends ReadOptions[js.Any] {
  
  def callback(newData: js.Any): Unit = js.native
  @JSName("callback")
  var callback_Original: WatchCallback = js.native
}
