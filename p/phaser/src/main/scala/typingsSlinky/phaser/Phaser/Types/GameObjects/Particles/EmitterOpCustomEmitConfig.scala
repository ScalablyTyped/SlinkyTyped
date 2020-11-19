package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import typingsSlinky.phaser.Phaser.GameObjects.Particles.Particle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitterOpCustomEmitConfig extends _EmitterOpOnEmitType {
  
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  def onEmit(particle: Particle, key: String, value: Double): Unit = js.native
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  @JSName("onEmit")
  var onEmit_Original: EmitterOpOnEmitCallback = js.native
}
