package typingsSlinky.fastMemoize.mod

import typingsSlinky.fastMemoize.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache[K, V] extends js.Object {
  @JSName("create")
  var create_Original: CacheCreateFunc[K, V] = js.native
  def create(): Get[K, V] = js.native
}

