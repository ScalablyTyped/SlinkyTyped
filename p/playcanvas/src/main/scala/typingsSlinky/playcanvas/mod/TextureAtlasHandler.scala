package typingsSlinky.playcanvas.mod

import typingsSlinky.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link pc.TextureAtlas} resources.
  * @param loader - The resource loader.
  */
@JSImport("playcanvas", "TextureAtlasHandler")
@js.native
class TextureAtlasHandler protected () extends ResourceHandler {
  def this(loader: typingsSlinky.playcanvas.pc.ResourceLoader) = this()
}
