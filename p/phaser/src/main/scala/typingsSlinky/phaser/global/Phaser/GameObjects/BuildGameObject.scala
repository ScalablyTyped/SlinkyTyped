package typingsSlinky.phaser.global.Phaser.GameObjects

import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.Phaser.Types.GameObjects.GameObjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.GameObjects.BuildGameObject")
@js.native
object BuildGameObject extends js.Object {
  
  /**
    * Builds a Game Object using the provided configuration object.
    * @param scene A reference to the Scene.
    * @param gameObject The initial GameObject.
    * @param config The config to build the GameObject with.
    */
  def apply(
    scene: Scene,
    gameObject: typingsSlinky.phaser.Phaser.GameObjects.GameObject,
    config: GameObjectConfig
  ): typingsSlinky.phaser.Phaser.GameObjects.GameObject = js.native
}
