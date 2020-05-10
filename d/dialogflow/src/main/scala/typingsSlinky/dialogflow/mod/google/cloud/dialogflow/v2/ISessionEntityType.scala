package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.EntityType.IEntity
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.SessionEntityType.EntityOverrideMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SessionEntityType. */
@js.native
trait ISessionEntityType extends js.Object {
  /** SessionEntityType entities */
  var entities: js.UndefOr[js.Array[IEntity] | Null] = js.native
  /** SessionEntityType entityOverrideMode */
  var entityOverrideMode: js.UndefOr[EntityOverrideMode | Null] = js.native
  /** SessionEntityType name */
  var name: js.UndefOr[String | Null] = js.native
}

object ISessionEntityType {
  @scala.inline
  def apply(): ISessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISessionEntityType]
  }
  @scala.inline
  implicit class ISessionEntityTypeOps[Self <: ISessionEntityType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntities(value: js.Array[IEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitiesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entities")(null)
        ret
    }
    @scala.inline
    def withEntityOverrideMode(value: EntityOverrideMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityOverrideMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityOverrideMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityOverrideMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityOverrideModeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityOverrideMode")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

