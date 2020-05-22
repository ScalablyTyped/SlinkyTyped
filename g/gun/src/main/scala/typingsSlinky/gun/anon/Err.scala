package typingsSlinky.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err extends js.Object {
  var err: js.Error
  var ok: js.Any
}

object Err {
  @scala.inline
  def apply(err: js.Error, ok: js.Any): Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
}

