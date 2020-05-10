package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticleEmitterEdgeZoneConfig extends js.Object {
  /**
    * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
    */
  var quantity: integer = js.native
  /**
    * Whether one endpoint will be removed if it's identical to the other.
    */
  var seamless: js.UndefOr[Boolean] = js.native
  /**
    * A shape representing the zone. See {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
    */
  var source: EdgeZoneSource = js.native
  /**
    * The distance between each particle. When set, `quantity` is implied and should be set to 0.
    */
  var stepRate: js.UndefOr[Double] = js.native
  /**
    * 'edge'.
    */
  var `type`: String = js.native
  /**
    * Whether particles are placed from start to end and then end to start.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}

object ParticleEmitterEdgeZoneConfig {
  @scala.inline
  def apply(quantity: integer, source: EdgeZoneSource, `type`: String): ParticleEmitterEdgeZoneConfig = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterEdgeZoneConfig]
  }
  @scala.inline
  implicit class ParticleEmitterEdgeZoneConfigOps[Self <: ParticleEmitterEdgeZoneConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: EdgeZoneSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeamless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seamless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeamless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seamless")(js.undefined)
        ret
    }
    @scala.inline
    def withStepRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepRate")(js.undefined)
        ret
    }
    @scala.inline
    def withYoyo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoyo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yoyo")(js.undefined)
        ret
    }
  }
  
}

