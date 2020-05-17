package typingsSlinky.minecraftScriptingTypesShared

import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntity extends IMinecraftObject {
  /**
    * The identifier of the entity, e.g., "minecraft:sheep", or "minecraft:pumpkin_seeds"
    */
  val __identifier__ : String = js.native
  /**
    * READ ONLY. The type of the entity
    */
  val __type__ : entity | item_entity = js.native
  /**
    * READ ONLY. This is the unique identifier of the query
    */
  val id: Double = js.native
}

object IEntity {
  @scala.inline
  def apply(__identifier__ : String, __type__ : entity | item_entity, id: Double): IEntity = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntity]
  }
  @scala.inline
  implicit class IEntityOps[Self <: IEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__identifier__(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__identifier__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__type__(value: entity | item_entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__type__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

