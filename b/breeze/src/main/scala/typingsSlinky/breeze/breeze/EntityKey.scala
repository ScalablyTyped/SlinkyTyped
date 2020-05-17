package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityKey extends js.Object {
  var entityType: EntityType = js.native
  var values: js.Array[_] = js.native
  def equals(entityKey: EntityKey): Boolean = js.native
}

object EntityKey {
  @scala.inline
  def apply(entityType: EntityType, equals: EntityKey => Boolean, values: js.Array[_]): EntityKey = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityKey]
  }
  @scala.inline
  implicit class EntityKeyOps[Self <: EntityKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityType(value: EntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquals(value: EntityKey => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

