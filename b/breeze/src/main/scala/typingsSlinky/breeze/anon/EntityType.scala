package typingsSlinky.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityType extends js.Object {
  var entityType: js.UndefOr[typingsSlinky.breeze.breeze.EntityType] = js.native
  var ignore: js.UndefOr[Boolean] = js.native
  var nodeId: js.UndefOr[js.Any] = js.native
  var nodeRefId: js.UndefOr[js.Any] = js.native
}

object EntityType {
  @scala.inline
  def apply(): EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityType]
  }
  @scala.inline
  implicit class EntityTypeOps[Self <: EntityType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityType(value: typingsSlinky.breeze.breeze.EntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeRefId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRefId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeRefId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRefId")(js.undefined)
        ret
    }
  }
  
}

