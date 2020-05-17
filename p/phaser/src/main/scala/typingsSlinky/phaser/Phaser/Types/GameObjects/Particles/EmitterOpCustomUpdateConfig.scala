package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import typingsSlinky.phaser.Phaser.GameObjects.Particles.Particle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitterOpCustomUpdateConfig extends EmitterOpOnUpdateType {
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  var onEmit: js.UndefOr[EmitterOpOnEmitCallback] = js.native
  /**
    * A callback that is invoked each time the emitter updates.
    */
  @JSName("onUpdate")
  var onUpdate_Original: EmitterOpOnUpdateCallback = js.native
  /**
    * A callback that is invoked each time the emitter updates.
    */
  def onUpdate(particle: Particle, key: String, t: Double, value: Double): Unit = js.native
}

