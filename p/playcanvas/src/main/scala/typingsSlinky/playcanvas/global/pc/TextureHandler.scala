package typingsSlinky.playcanvas.global.pc

import typingsSlinky.playcanvas.pc.ResourceHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading 2D and 3D {@link pc.Texture} resources.
  * @param device - The graphics device.
  * @param assets - The asset registry.
  * @param loader - The resource loader.
  */
@JSGlobal("pc.TextureHandler")
@js.native
class TextureHandler protected () extends ResourceHandler {
  def this(
    device: typingsSlinky.playcanvas.pc.GraphicsDevice,
    assets: typingsSlinky.playcanvas.pc.AssetRegistry,
    loader: typingsSlinky.playcanvas.pc.ResourceLoader
  ) = this()
}
