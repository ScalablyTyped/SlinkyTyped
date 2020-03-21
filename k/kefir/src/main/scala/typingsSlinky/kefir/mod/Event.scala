package typingsSlinky.kefir.mod

import typingsSlinky.kefir.kefirStrings.end
import typingsSlinky.kefir.kefirStrings.error
import typingsSlinky.kefir.kefirStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.kefir.AnonType[V]
  - typingsSlinky.kefir.AnonTypeValue[E]
  - typingsSlinky.kefir.AnonValueVoid
*/
trait Event[V, E] extends js.Object

object Event {
  @scala.inline
  def AnonType[V, E](`type`: value, value: V): Event[V, E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[V, E]]
  }
  @scala.inline
  def AnonTypeValue[V, E](`type`: error, value: E): Event[V, E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[V, E]]
  }
  @scala.inline
  def AnonValueVoid[V, E](`type`: end, value: Unit): Event[V, E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[V, E]]
  }
}

