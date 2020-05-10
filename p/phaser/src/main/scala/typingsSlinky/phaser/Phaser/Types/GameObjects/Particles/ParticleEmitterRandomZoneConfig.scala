package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticleEmitterRandomZoneConfig extends js.Object {
  /**
    * A shape representing the zone. See {@link Phaser.GameObjects.Particles.Zones.RandomZone#source}.
    */
  var source: RandomZoneSource = js.native
  /**
    * 'random'.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ParticleEmitterRandomZoneConfig {
  @scala.inline
  def apply(source: RandomZoneSource): ParticleEmitterRandomZoneConfig = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterRandomZoneConfig]
  }
  @scala.inline
  implicit class ParticleEmitterRandomZoneConfigOps[Self <: ParticleEmitterRandomZoneConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: RandomZoneSource): Self = {
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
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

