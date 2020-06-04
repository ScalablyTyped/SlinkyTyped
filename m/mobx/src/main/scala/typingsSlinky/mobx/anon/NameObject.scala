package typingsSlinky.mobx.anon

import typingsSlinky.mobx.mobxStrings.remove
import typingsSlinky.mobx.observableobjectMod.IObjectDidChange
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameObject extends IObjectDidChange {
  var name: PropertyKey
  var `object`: js.Any
  var oldValue: js.Any
  var `type`: remove
}

object NameObject {
  @scala.inline
  def apply(name: PropertyKey, `object`: js.Any, oldValue: js.Any, `type`: remove): NameObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameObject]
  }
  @scala.inline
  implicit class NameObjectOps[Self <: NameObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: PropertyKey): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: remove): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

