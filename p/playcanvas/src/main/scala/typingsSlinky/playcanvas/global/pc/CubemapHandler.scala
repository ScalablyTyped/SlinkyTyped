package typingsSlinky.playcanvas.global.pc

import typingsSlinky.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading cubemap {@link pc.Texture} resources.
  * @param device - The graphics device.
  * @param assets - The asset registry.
  * @param loader - The resource loader.
  */
@JSGlobal("pc.CubemapHandler")
@js.native
class CubemapHandler protected () extends ResourceHandler {
  def this(
    device: typingsSlinky.playcanvas.pc.GraphicsDevice,
    assets: typingsSlinky.playcanvas.pc.AssetRegistry,
    loader: typingsSlinky.playcanvas.pc.ResourceLoader
  ) = this()
}
