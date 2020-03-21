package typingsSlinky.reactMovable

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRef extends js.Object {
  var ref: ReactRef[_]
}

object AnonRef {
  @scala.inline
  def apply(ref: ReactRef[_]): AnonRef = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRef]
  }
}

