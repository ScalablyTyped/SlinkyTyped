package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Nameable component describes an entity's ability to be named using a nametag and whether the name shows up or not once applied. Additionally, scripting allows setting the name of the entity directly with the property 'name'.
  */
@js.native
trait INameableComponent extends js.Object {
  /**
    * If true, this entity can be renamed with name tags
    * @default true
    */
  var allowNameTagRenaming: Boolean = js.native
  /**
    * If true, the name will always be shown
    * @default false
    */
  var alwaysShow: Boolean = js.native
  /**
    * Trigger to run when the entity gets named
    */
  var default_trigger: MinecraftTrigger | String = js.native
  /**
    * The current name of the entity, empty if the entity hasn't been named yet, making this non-empty will apply the name to the entity
    */
  var name: String = js.native
  /**
    * Describes the special names for this entity and the events to call when the entity acquires those names
    */
  var name_actions: js.Array[AnonNamefilter] = js.native
}

object INameableComponent {
  @scala.inline
  def apply(
    allowNameTagRenaming: Boolean,
    alwaysShow: Boolean,
    default_trigger: MinecraftTrigger | String,
    name: String,
    name_actions: js.Array[AnonNamefilter]
  ): INameableComponent = {
    val __obj = js.Dynamic.literal(allowNameTagRenaming = allowNameTagRenaming.asInstanceOf[js.Any], alwaysShow = alwaysShow.asInstanceOf[js.Any], default_trigger = default_trigger.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_actions = name_actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[INameableComponent]
  }
  @scala.inline
  implicit class INameableComponentOps[Self <: INameableComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNameTagRenaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNameTagRenaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlwaysShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_trigger(value: MinecraftTrigger | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName_actions(value: js.Array[AnonNamefilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_actions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

