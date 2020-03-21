package typingsSlinky.reactLoadable

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault[Props] extends js.Object {
  var default: ReactComponentClass[Props]
}

object AnonDefault {
  @scala.inline
  def apply[Props](default: ReactComponentClass[Props]): AnonDefault[Props] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault[Props]]
  }
}

