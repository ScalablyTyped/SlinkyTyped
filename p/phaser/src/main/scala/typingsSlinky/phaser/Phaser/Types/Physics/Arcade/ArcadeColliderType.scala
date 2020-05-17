package typingsSlinky.phaser.Phaser.Types.Physics.Arcade

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.Phaser.Physics.Arcade.Group
import typingsSlinky.phaser.Phaser.Physics.Arcade.Image
import typingsSlinky.phaser.Phaser.Physics.Arcade.Sprite
import typingsSlinky.phaser.Phaser.Physics.Arcade.StaticGroup
import typingsSlinky.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typingsSlinky.phaser.Phaser.Tilemaps.StaticTilemapLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Arcade Physics Collider Type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phaser.Phaser.GameObjects.GameObject
  - typingsSlinky.phaser.Phaser.GameObjects.Group
  - typingsSlinky.phaser.Phaser.Physics.Arcade.Sprite
  - typingsSlinky.phaser.Phaser.Physics.Arcade.Image
  - typingsSlinky.phaser.Phaser.Physics.Arcade.StaticGroup
  - typingsSlinky.phaser.Phaser.Physics.Arcade.Group
  - typingsSlinky.phaser.Phaser.Tilemaps.DynamicTilemapLayer
  - typingsSlinky.phaser.Phaser.Tilemaps.StaticTilemapLayer
  - js.Array[
typingsSlinky.phaser.Phaser.Tilemaps.DynamicTilemapLayer | typingsSlinky.phaser.Phaser.GameObjects.GameObject | typingsSlinky.phaser.Phaser.Physics.Arcade.Group | typingsSlinky.phaser.Phaser.Physics.Arcade.Image | typingsSlinky.phaser.Phaser.Physics.Arcade.Sprite | typingsSlinky.phaser.Phaser.Physics.Arcade.StaticGroup | typingsSlinky.phaser.Phaser.Tilemaps.StaticTilemapLayer]
*/
trait ArcadeColliderType extends js.Object

object ArcadeColliderType {
  @scala.inline
  implicit def apply(
    value: js.Array[
      DynamicTilemapLayer | GameObject | Group | Image | Sprite | StaticGroup | StaticTilemapLayer
    ]
  ): ArcadeColliderType = value.asInstanceOf[ArcadeColliderType]
  @scala.inline
  implicit def apply(value: DynamicTilemapLayer): ArcadeColliderType = value.asInstanceOf[ArcadeColliderType]
  @scala.inline
  implicit def apply(value: GameObject): ArcadeColliderType = value.asInstanceOf[ArcadeColliderType]
  @scala.inline
  implicit def apply(value: Group): ArcadeColliderType = value.asInstanceOf[ArcadeColliderType]
  @scala.inline
  implicit def apply(value: typingsSlinky.phaser.Phaser.GameObjects.Group): ArcadeColliderType = value.asInstanceOf[ArcadeColliderType]
  @scala.inline
  implicit def apply(value: Image): ArcadeColliderType = value.asInstanceOf[ArcadeColliderType]
  @scala.inline
  implicit def apply(value: Sprite): ArcadeColliderType = value.asInstanceOf[ArcadeColliderType]
  @scala.inline
  implicit def apply(value: StaticGroup): ArcadeColliderType = value.asInstanceOf[ArcadeColliderType]
  @scala.inline
  implicit def apply(value: StaticTilemapLayer): ArcadeColliderType = value.asInstanceOf[ArcadeColliderType]
}

