package typingsSlinky.kefir

import typingsSlinky.kefir.kefirStrings.value
import typingsSlinky.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[V]
  extends Event[V, js.Any] {
  var `type`: value
  var value: V
}

object AnonType {
  @scala.inline
  def apply[V](`type`: value, value: V): AnonType[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[V]]
  }
}

