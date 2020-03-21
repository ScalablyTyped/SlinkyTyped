package typingsSlinky.nextServer

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault[P] extends js.Object {
  var default: ReactComponentClass[P]
}

object AnonDefault {
  @scala.inline
  def apply[P](default: ReactComponentClass[P]): AnonDefault[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault[P]]
  }
}

