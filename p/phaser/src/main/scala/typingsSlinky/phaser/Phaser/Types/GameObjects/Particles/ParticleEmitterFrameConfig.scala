package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import typingsSlinky.phaser.Phaser.Textures.Frame
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticleEmitterFrameConfig extends js.Object {
  /**
    * Whether texture frames will be assigned consecutively (true) or at random (false).
    */
  var cycle: js.UndefOr[Boolean] = js.native
  /**
    * One or more texture frames.
    */
  var frames: js.UndefOr[Double | (js.Array[Double | Frame | String]) | String | Frame] = js.native
  /**
    * The number of consecutive particles receiving each texture frame, when `cycle` is true.
    */
  var quantity: js.UndefOr[integer] = js.native
}

object ParticleEmitterFrameConfig {
  @scala.inline
  def apply(): ParticleEmitterFrameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticleEmitterFrameConfig]
  }
  @scala.inline
  implicit class ParticleEmitterFrameConfigOps[Self <: ParticleEmitterFrameConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCycle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(js.undefined)
        ret
    }
    @scala.inline
    def withFrames(value: Double | (js.Array[Double | Frame | String]) | String | Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
  }
  
}

