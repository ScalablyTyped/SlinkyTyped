package typingsSlinky.mobx.anon

import typingsSlinky.mobx.mobxStrings.delete
import typingsSlinky.mobx.observablemapMod.IMapDidChange
import typingsSlinky.mobx.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object[K, V] extends IMapDidChange[K, V] {
  var name: K
  var `object`: ObservableMap[K, V]
  var oldValue: V
  var `type`: delete
}

object Object {
  @scala.inline
  def apply[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V, `type`: delete): Object[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object[K, V]]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object[_, _], K, V] (val x: Self with (Object[K, V])) extends AnyVal {
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
    def setName(value: K): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: ObservableMap[K, V]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: V): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: delete): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

