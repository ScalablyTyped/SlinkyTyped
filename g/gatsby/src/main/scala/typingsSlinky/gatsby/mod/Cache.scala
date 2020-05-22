package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.anon.Create
import typingsSlinky.gatsby.anon.Del
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: Del
  var name: String
  var store: Create
}

object Cache {
  @scala.inline
  def apply(cache: Del, name: String, store: Create): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}

