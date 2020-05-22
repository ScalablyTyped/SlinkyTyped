package typingsSlinky.reactLoadable.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default[Props] extends js.Object {
  var default: ReactComponentClass[Props]
}

object Default {
  @scala.inline
  def apply[Props](default: ReactComponentClass[Props]): Default[Props] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[Props]]
  }
}

