package typingsSlinky.phaser.phaserMod.Input

import typingsSlinky.phaser.Phaser.Textures.TextureManager
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Input.CreatePixelPerfectHandler")
@js.native
object CreatePixelPerfectHandler extends js.Object {
  
  /**
    * Creates a new Pixel Perfect Handler function.
    * 
    * Access via `InputPlugin.makePixelPerfect` rather than calling it directly.
    * @param textureManager A reference to the Texture Manager.
    * @param alphaTolerance The alpha level that the pixel should be above to be included as a successful interaction.
    */
  def apply(textureManager: TextureManager, alphaTolerance: integer): js.Function = js.native
}
