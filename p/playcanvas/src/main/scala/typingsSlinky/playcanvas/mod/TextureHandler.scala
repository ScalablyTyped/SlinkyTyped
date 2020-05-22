package typingsSlinky.playcanvas.mod

import typingsSlinky.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource handler used for loading 2D and 3D {@link pc.Texture} resources.
  * @param device - The graphics device.
  * @param assets - The asset registry.
  * @param loader - The resource loader.
  */
@JSImport("playcanvas", "TextureHandler")
@js.native
class TextureHandler protected () extends ResourceHandler {
  def this(
    device: typingsSlinky.playcanvas.pc.GraphicsDevice,
    assets: typingsSlinky.playcanvas.pc.AssetRegistry,
    loader: typingsSlinky.playcanvas.pc.ResourceLoader
  ) = this()
}

