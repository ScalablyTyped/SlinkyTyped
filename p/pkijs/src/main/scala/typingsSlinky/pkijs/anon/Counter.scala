package typingsSlinky.pkijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  var counter: Double
  var result: js.typedarray.ArrayBuffer
}

object Counter {
  @scala.inline
  def apply(counter: Double, result: js.typedarray.ArrayBuffer): Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
}

