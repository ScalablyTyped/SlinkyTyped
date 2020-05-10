package typingsSlinky.mobx

import typingsSlinky.mobx.mobxStrings.delete
import typingsSlinky.mobx.observablemapMod.IMapDidChange
import typingsSlinky.mobx.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonObject[K, V] extends IMapDidChange[K, V] {
  var name: K = js.native
  var `object`: ObservableMap[K, V] = js.native
  var oldValue: V = js.native
  var `type`: delete = js.native
}

object AnonObject {
  @scala.inline
  def apply[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V, `type`: delete): AnonObject[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObject[K, V]]
  }
  @scala.inline
  implicit class AnonObjectOps[Self[k, v] <: AnonObject[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withName(value: K): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: ObservableMap[K, V]): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: delete): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

