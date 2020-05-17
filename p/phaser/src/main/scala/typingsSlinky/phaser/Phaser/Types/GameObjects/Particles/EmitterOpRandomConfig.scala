package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a random value within a range.
  */
@js.native
trait EmitterOpRandomConfig extends EmitterOpOnEmitType {
  /**
    * The minimum and maximum values, as [min, max].
    */
  var random: js.Array[Double] = js.native
}

object EmitterOpRandomConfig {
  @scala.inline
  def apply(random: js.Array[Double]): EmitterOpRandomConfig = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpRandomConfig]
  }
  @scala.inline
  implicit class EmitterOpRandomConfigOps[Self <: EmitterOpRandomConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRandom(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

