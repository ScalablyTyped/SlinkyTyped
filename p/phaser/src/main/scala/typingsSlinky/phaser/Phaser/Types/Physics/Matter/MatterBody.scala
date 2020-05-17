package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import typingsSlinky.phaser.MatterJS.BodyType
import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.Phaser.Physics.Matter.Image
import typingsSlinky.phaser.Phaser.Physics.Matter.Sprite
import typingsSlinky.phaser.Phaser.Physics.Matter.TileBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phaser.MatterJS.BodyType
  - typingsSlinky.phaser.Phaser.GameObjects.GameObject
  - typingsSlinky.phaser.Phaser.Physics.Matter.Image
  - typingsSlinky.phaser.Phaser.Physics.Matter.Sprite
  - typingsSlinky.phaser.Phaser.Physics.Matter.TileBody
*/
trait MatterBody extends js.Object

object MatterBody {
  @scala.inline
  implicit def apply(value: BodyType): MatterBody = value.asInstanceOf[MatterBody]
  @scala.inline
  implicit def apply(value: GameObject): MatterBody = value.asInstanceOf[MatterBody]
  @scala.inline
  implicit def apply(value: Image): MatterBody = value.asInstanceOf[MatterBody]
  @scala.inline
  implicit def apply(value: Sprite): MatterBody = value.asInstanceOf[MatterBody]
  @scala.inline
  implicit def apply(value: TileBody): MatterBody = value.asInstanceOf[MatterBody]
}

