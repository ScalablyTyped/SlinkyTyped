package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
  - typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig
  - typingsSlinky.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig
*/
trait EmitterOpOnUpdateType extends js.Object

object EmitterOpOnUpdateType {
  @scala.inline
  implicit def apply(value: EmitterOpCustomUpdateConfig): EmitterOpOnUpdateType = value.asInstanceOf[EmitterOpOnUpdateType]
  @scala.inline
  implicit def apply(value: EmitterOpEaseConfig): EmitterOpOnUpdateType = value.asInstanceOf[EmitterOpOnUpdateType]
  @scala.inline
  implicit def apply(value: EmitterOpOnUpdateCallback): EmitterOpOnUpdateType = value.asInstanceOf[EmitterOpOnUpdateType]
}

