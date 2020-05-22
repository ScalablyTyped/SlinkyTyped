package typingsSlinky.msRest.anon

import typingsSlinky.msRest.mod.Mapper
import typingsSlinky.msRest.mod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var name: MapperType
  var value: Mapper
}

object Value {
  @scala.inline
  def apply(name: MapperType, value: Mapper): Value = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

