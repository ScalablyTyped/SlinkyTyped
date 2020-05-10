package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the ways the player can interact with the entity to which this component is applied.
  */
@js.native
trait IInteractComponent extends js.Object {
  /**
    * Loot table with items to add to the player's inventory upon successful interaction
    */
  var add_items: AnonTable = js.native
  /**
    * Time in seconds before this entity can be interacted with again
    * @default 0.0
    */
  var cooldown: Double = js.native
  /**
    * The amount of damage the item will take when used to interact with this entity. A value of 0 means the item won't lose durability
    * @default 0
    */
  var hurt_item: Double = js.native
  /**
    * Text to show when the player is able to interact in this way with this entity when playing with Touch-screen controls
    */
  var interact_text: String = js.native
  /**
    * An event identifier to fire when the interaction occurs
    */
  var on_interact: MinecraftTrigger | String = js.native
  /**
    * Particle effect that will be triggered at the start of the interaction
    */
  var particle_on_start: AnonParticleoffsettowardsinteractor = js.native
  /**
    * An array of sound identifiers to play when the interaction occurs
    */
  var play_sounds: js.Array[String] = js.native
  /**
    * An array of entity identifiers to spawn when the interaction occurs
    */
  var spawn_entities: js.Array[String] = js.native
  /**
    * Loot table with items to drop on the ground upon successful interaction
    */
  var spawn_items: AnonTable = js.native
  /**
    * If true, the player will do the 'swing' animation when interacting with this entity
    * @default false
    */
  var swing: Boolean = js.native
  /**
    * The item used will transform to this item upon successful interaction. Format: itemName:auxValue
    */
  var transform_to_item: js.UndefOr[String] = js.native
  /**
    * If true, the interaction will use an item
    * @default false
    */
  var use_item: Boolean = js.native
}

object IInteractComponent {
  @scala.inline
  def apply(
    add_items: AnonTable,
    cooldown: Double,
    hurt_item: Double,
    interact_text: String,
    on_interact: MinecraftTrigger | String,
    particle_on_start: AnonParticleoffsettowardsinteractor,
    play_sounds: js.Array[String],
    spawn_entities: js.Array[String],
    spawn_items: AnonTable,
    swing: Boolean,
    use_item: Boolean
  ): IInteractComponent = {
    val __obj = js.Dynamic.literal(add_items = add_items.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], hurt_item = hurt_item.asInstanceOf[js.Any], interact_text = interact_text.asInstanceOf[js.Any], on_interact = on_interact.asInstanceOf[js.Any], particle_on_start = particle_on_start.asInstanceOf[js.Any], play_sounds = play_sounds.asInstanceOf[js.Any], spawn_entities = spawn_entities.asInstanceOf[js.Any], spawn_items = spawn_items.asInstanceOf[js.Any], swing = swing.asInstanceOf[js.Any], use_item = use_item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInteractComponent]
  }
  @scala.inline
  implicit class IInteractComponentOps[Self <: IInteractComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd_items(value: AnonTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCooldown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHurt_item(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hurt_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteract_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interact_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn_interact(value: MinecraftTrigger | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_interact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticle_on_start(value: AnonParticleoffsettowardsinteractor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particle_on_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlay_sounds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play_sounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpawn_entities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawn_entities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpawn_items(value: AnonTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawn_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse_item(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform_to_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform_to_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform_to_item: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform_to_item")(js.undefined)
        ret
    }
  }
  
}

