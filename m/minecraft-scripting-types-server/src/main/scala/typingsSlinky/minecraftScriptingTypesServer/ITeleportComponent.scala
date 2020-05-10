package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.VectorArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This controls the entity's ability to teleport itself (similar to the Enderman). If you wish to teleport the entity once use the Position component instead.
  */
@js.native
trait ITeleportComponent extends js.Object {
  /**
    * Modifies the chance that the entity will teleport if the entity is in darkness
    * @default 0.01
    */
  var darkTeleportChance: Double = js.native
  /**
    * Modifies the chance that the entity will teleport if the entity is in daylight
    * @default 0.01
    */
  var lightTeleportChance: Double = js.native
  /**
    * Maximum amount of time in seconds between random teleports
    * @default 20.0
    */
  var maxRandomTeleportTime: Double = js.native
  /**
    * Minimum amount of time in seconds between random teleports
    * @default 0.0
    */
  var minRandomTeleportTime: Double = js.native
  /**
    * Entity will teleport to a random position within the area defined by this cube
    * @default [32.0, 16.0, 32.0]
    */
  var randomTeleportCube: VectorArray = js.native
  /**
    * If true, the entity will teleport randomly
    * @default true
    */
  var randomTeleports: Boolean = js.native
  /**
    * Maximum distance the entity will teleport when chasing a target
    * @default 16.0
    */
  var targetDistance: Double = js.native
  /**
    * The chance that the entity will teleport between 0.0 and 1.0. 1.0 means 100%
    * @default 1.0
    */
  var target_teleport_chance: Double = js.native
}

object ITeleportComponent {
  @scala.inline
  def apply(
    darkTeleportChance: Double,
    lightTeleportChance: Double,
    maxRandomTeleportTime: Double,
    minRandomTeleportTime: Double,
    randomTeleportCube: VectorArray,
    randomTeleports: Boolean,
    targetDistance: Double,
    target_teleport_chance: Double
  ): ITeleportComponent = {
    val __obj = js.Dynamic.literal(darkTeleportChance = darkTeleportChance.asInstanceOf[js.Any], lightTeleportChance = lightTeleportChance.asInstanceOf[js.Any], maxRandomTeleportTime = maxRandomTeleportTime.asInstanceOf[js.Any], minRandomTeleportTime = minRandomTeleportTime.asInstanceOf[js.Any], randomTeleportCube = randomTeleportCube.asInstanceOf[js.Any], randomTeleports = randomTeleports.asInstanceOf[js.Any], targetDistance = targetDistance.asInstanceOf[js.Any], target_teleport_chance = target_teleport_chance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeleportComponent]
  }
  @scala.inline
  implicit class ITeleportComponentOps[Self <: ITeleportComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDarkTeleportChance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkTeleportChance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightTeleportChance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightTeleportChance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRandomTeleportTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRandomTeleportTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinRandomTeleportTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRandomTeleportTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRandomTeleportCube(value: VectorArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomTeleportCube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRandomTeleports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomTeleports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_teleport_chance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_teleport_chance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

