package typingsSlinky.phaser.phaserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object GameObjects {
  
  /**
    * Builds a Game Object using the provided configuration object.
    * @param scene A reference to the Scene.
    * @param gameObject The initial GameObject.
    * @param config The config to build the GameObject with.
    */
  @scala.inline
  def BuildGameObject(
    scene: typingsSlinky.phaser.Phaser.Scene,
    gameObject: typingsSlinky.phaser.Phaser.GameObjects.GameObject,
    config: typingsSlinky.phaser.Phaser.Types.GameObjects.GameObjectConfig
  ): typingsSlinky.phaser.Phaser.GameObjects.GameObject = (typingsSlinky.phaser.phaserMod.GameObjects.^.asInstanceOf[js.Dynamic].applyDynamic("BuildGameObject")(scene.asInstanceOf[js.Any], gameObject.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.phaser.Phaser.GameObjects.GameObject]
  
  /**
    * Adds an Animation component to a Sprite and populates it based on the given config.
    * @param sprite The sprite to add an Animation component to.
    * @param config The animation config.
    */
  @scala.inline
  def BuildGameObjectAnimation(sprite: typingsSlinky.phaser.Phaser.GameObjects.Sprite, config: js.Object): typingsSlinky.phaser.Phaser.GameObjects.Sprite = (typingsSlinky.phaser.phaserMod.GameObjects.^.asInstanceOf[js.Dynamic].applyDynamic("BuildGameObjectAnimation")(sprite.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.phaser.Phaser.GameObjects.Sprite]
}
