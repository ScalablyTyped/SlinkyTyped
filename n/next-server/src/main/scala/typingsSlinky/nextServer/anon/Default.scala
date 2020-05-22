package typingsSlinky.nextServer.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default[P] extends js.Object {
  var default: ReactComponentClass[P]
}

object Default {
  @scala.inline
  def apply[P](default: ReactComponentClass[P]): Default[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[P]]
  }
}

