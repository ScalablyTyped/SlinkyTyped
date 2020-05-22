package typingsSlinky.blissfuljs

import typingsSlinky.blissfuljs.BlissNS.BlissBindedArray
import typingsSlinky.blissfuljs.BlissNS.BlissCollectionArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  @JSName("_")
  var _underscore: BlissBindedArray[T] with BlissCollectionArray[T]
}

object Array {
  @scala.inline
  def apply[T](_underscore: BlissBindedArray[T] with BlissCollectionArray[T]): Array[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
}

