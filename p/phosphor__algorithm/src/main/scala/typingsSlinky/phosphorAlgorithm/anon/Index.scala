package typingsSlinky.phosphorAlgorithm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index[T] extends js.Object {
  var index: Double
  var value: js.UndefOr[T] = js.undefined
}

object Index {
  @scala.inline
  def apply[T](index: Double, value: T = null): Index[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
}

