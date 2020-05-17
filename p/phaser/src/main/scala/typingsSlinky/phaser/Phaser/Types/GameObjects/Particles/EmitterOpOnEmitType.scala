package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[scala.Double]
  - typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback
  - typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig
  - typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig
  - typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig
  - typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig
  - typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig
*/
trait EmitterOpOnEmitType extends js.Object

object EmitterOpOnEmitType {
  @scala.inline
  implicit def apply(value: js.Array[Double]): EmitterOpOnEmitType = value.asInstanceOf[EmitterOpOnEmitType]
  @scala.inline
  implicit def apply(value: Double): EmitterOpOnEmitType = value.asInstanceOf[EmitterOpOnEmitType]
  @scala.inline
  implicit def apply(value: EmitterOpCustomEmitConfig): EmitterOpOnEmitType = value.asInstanceOf[EmitterOpOnEmitType]
  @scala.inline
  implicit def apply(value: EmitterOpOnEmitCallback): EmitterOpOnEmitType = value.asInstanceOf[EmitterOpOnEmitType]
  @scala.inline
  implicit def apply(value: EmitterOpRandomConfig): EmitterOpOnEmitType = value.asInstanceOf[EmitterOpOnEmitType]
  @scala.inline
  implicit def apply(value: EmitterOpRandomMinMaxConfig): EmitterOpOnEmitType = value.asInstanceOf[EmitterOpOnEmitType]
  @scala.inline
  implicit def apply(value: EmitterOpRandomStartEndConfig): EmitterOpOnEmitType = value.asInstanceOf[EmitterOpOnEmitType]
  @scala.inline
  implicit def apply(value: EmitterOpSteppedConfig): EmitterOpOnEmitType = value.asInstanceOf[EmitterOpOnEmitType]
}

