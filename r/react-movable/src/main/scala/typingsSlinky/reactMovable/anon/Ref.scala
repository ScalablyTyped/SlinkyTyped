package typingsSlinky.reactMovable.anon

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref extends js.Object {
  var ref: ReactRef[_]
}

object Ref {
  @scala.inline
  def apply(ref: ReactRef[_]): Ref = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
}

