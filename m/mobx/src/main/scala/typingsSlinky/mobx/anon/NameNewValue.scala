package typingsSlinky.mobx.anon

import typingsSlinky.mobx.mobxStrings.add
import typingsSlinky.mobx.mobxStrings.update
import typingsSlinky.mobx.observableobjectMod.IObjectWillChange
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameNewValue extends IObjectWillChange {
  var name: PropertyKey
  var newValue: js.Any
  var `object`: js.Any
  var `type`: update | add
}

object NameNewValue {
  @scala.inline
  def apply(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: update | add): NameNewValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameNewValue]
  }
}

