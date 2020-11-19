package typingsSlinky.phaser.Phaser.GameObjects

import typingsSlinky.phaser.Phaser.GameObjects.Components.BlendMode
import typingsSlinky.phaser.Phaser.GameObjects.Components.Depth
import typingsSlinky.phaser.Phaser.GameObjects.Components.Mask
import typingsSlinky.phaser.Phaser.GameObjects.Components.Pipeline
import typingsSlinky.phaser.Phaser.GameObjects.Components.ScrollFactor
import typingsSlinky.phaser.Phaser.GameObjects.Components.Size
import typingsSlinky.phaser.Phaser.GameObjects.Components.Texture
import typingsSlinky.phaser.Phaser.GameObjects.Components.Transform
import typingsSlinky.phaser.Phaser.GameObjects.Components.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Mesh Game Object.
  */
@js.native
trait Mesh
  extends GameObject
     with BlendMode
     with Depth
     with Mask
     with Pipeline
     with Size
     with Texture
     with Transform
     with Visible
     with ScrollFactor {
  
  /**
    * An array containing the alpha data for this Mesh.
    */
  var alphas: js.typedarray.Float32Array = js.native
  
  /**
    * An array containing the color data for this Mesh.
    */
  var colors: js.typedarray.Uint32Array = js.native
  
  /**
    * This method is left intentionally empty and does not do anything.
    * It is retained to allow a Mesh or Quad to be added to a Container.
    */
  def setAlpha(): Unit = js.native
  
  /**
    * Fill or additive mode used when blending the color values?
    */
  var tintFill: Boolean = js.native
  
  /**
    * An array containing the uv data for this Mesh.
    */
  var uv: js.typedarray.Float32Array = js.native
  
  /**
    * An array containing the vertices data for this Mesh.
    */
  var vertices: js.typedarray.Float32Array = js.native
}
