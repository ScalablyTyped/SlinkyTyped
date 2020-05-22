package typingsSlinky.kefir.anon

import typingsSlinky.kefir.kefirStrings.error
import typingsSlinky.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeValue[E]
  extends Event[js.Any, E] {
  var `type`: error
  var value: E
}

object TypeValue {
  @scala.inline
  def apply[E](`type`: error, value: E): TypeValue[E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeValue[E]]
  }
}

