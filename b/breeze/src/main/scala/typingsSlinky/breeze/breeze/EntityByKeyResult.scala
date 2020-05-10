package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityByKeyResult extends js.Object {
  var entity: Entity = js.native
  var entityKey: EntityKey = js.native
  var fromCache: Boolean = js.native
}

object EntityByKeyResult {
  @scala.inline
  def apply(entity: Entity, entityKey: EntityKey, fromCache: Boolean): EntityByKeyResult = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], entityKey = entityKey.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityByKeyResult]
  }
  @scala.inline
  implicit class EntityByKeyResultOps[Self <: EntityByKeyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityKey(value: EntityKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCache")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

