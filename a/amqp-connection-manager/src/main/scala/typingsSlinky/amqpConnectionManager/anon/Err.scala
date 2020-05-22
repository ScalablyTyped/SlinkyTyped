package typingsSlinky.amqpConnectionManager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err extends js.Object {
  var err: js.Error
}

object Err {
  @scala.inline
  def apply(err: js.Error): Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
}

