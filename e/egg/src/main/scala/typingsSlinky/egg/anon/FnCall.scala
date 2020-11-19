package typingsSlinky.egg.anon

import typingsSlinky.node.urlMod.URL_
import typingsSlinky.urllib.mod.HttpClientResponse
import typingsSlinky.urllib.mod.RequestOptions2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: String, callback: typingsSlinky.urllib.mod.Callback[T]): Unit = js.native
  def apply[T](url: String, options: RequestOptions2): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: String, options: RequestOptions2, callback: typingsSlinky.urllib.mod.Callback[T]): Unit = js.native
  def apply[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: URL_, callback: typingsSlinky.urllib.mod.Callback[T]): Unit = js.native
  def apply[T](url: URL_, options: RequestOptions2): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: URL_, options: RequestOptions2, callback: typingsSlinky.urllib.mod.Callback[T]): Unit = js.native
}
