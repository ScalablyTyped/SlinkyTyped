package typingsSlinky.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path[T] extends js.Object {
  var path: typingsSlinky.firebaseDatabase.pathMod.Path
  var value: T
}

object Path {
  @scala.inline
  def apply[T](path: typingsSlinky.firebaseDatabase.pathMod.Path, value: T): Path[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path[T]]
  }
}

