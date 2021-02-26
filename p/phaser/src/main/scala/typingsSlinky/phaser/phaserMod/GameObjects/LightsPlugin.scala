package typingsSlinky.phaser.phaserMod.GameObjects

import typingsSlinky.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Scene plugin that provides a {@link Phaser.GameObjects.LightsManager} for the Light2D pipeline.
  * 
  * Available from within a Scene via `this.lights`.
  * 
  * Add Lights using the {@link Phaser.GameObjects.LightsManager#addLight} method:
  * 
  * ```javascript
  * // Enable the Lights Manager because it is disabled by default
  * this.lights.enable();
  * 
  * // Create a Light at [400, 300] with a radius of 200
  * this.lights.addLight(400, 300, 200);
  * ```
  * 
  * For Game Objects to be affected by the Lights when rendered, you will need to set them to use the `Light2D` pipeline like so:
  * 
  * ```javascript
  * sprite.setPipeline('Light2D');
  * ```
  */
@JSImport("phaser", "GameObjects.LightsPlugin")
@js.native
class LightsPlugin protected ()
  extends typingsSlinky.phaser.Phaser.GameObjects.LightsPlugin {
  /**
    * 
    * @param scene The Scene that this Lights Plugin belongs to.
    */
  def this(scene: Scene) = this()
}
