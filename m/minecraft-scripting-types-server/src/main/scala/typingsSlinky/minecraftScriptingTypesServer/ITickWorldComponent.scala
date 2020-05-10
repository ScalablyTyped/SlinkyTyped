package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.IEntityTickingArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The tick world component is a read-only component that allows users to access the ticking areas on entities as well as the ticking area's data.
  */
@js.native
trait ITickWorldComponent extends js.Object {
  /**
    * distance_to_players
    */
  var distance_to_players: Double = js.native
  /**
    * Whether or not this ticking area will despawn when a player is out of range
    */
  var never_despawn: Boolean = js.native
  /**
    * The radius in chunks of the ticking area
    */
  var radius: Double = js.native
  /**
    * The ticking area entity that is attached to this entity
    */
  var ticking_area: IEntityTickingArea = js.native
}

object ITickWorldComponent {
  @scala.inline
  def apply(
    distance_to_players: Double,
    never_despawn: Boolean,
    radius: Double,
    ticking_area: IEntityTickingArea
  ): ITickWorldComponent = {
    val __obj = js.Dynamic.literal(distance_to_players = distance_to_players.asInstanceOf[js.Any], never_despawn = never_despawn.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ticking_area = ticking_area.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITickWorldComponent]
  }
  @scala.inline
  implicit class ITickWorldComponentOps[Self <: ITickWorldComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance_to_players(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance_to_players")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNever_despawn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("never_despawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicking_area(value: IEntityTickingArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticking_area")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

