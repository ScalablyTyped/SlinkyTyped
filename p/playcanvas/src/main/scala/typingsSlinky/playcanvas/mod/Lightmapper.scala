package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The lightmapper is used to bake scene lights into textures.
  * @param device - The grahpics device used by the lightmapper.
  * @param root - The root entity of the scene.
  * @param scene - The scene to lightmap.
  * @param renderer - The renderer.
  * @param assets - Registry of assets to lightmap.
  */
@JSImport("playcanvas", "Lightmapper")
@js.native
class Lightmapper protected ()
  extends typingsSlinky.playcanvas.pc.Lightmapper {
  def this(
    device: typingsSlinky.playcanvas.pc.GraphicsDevice,
    root: typingsSlinky.playcanvas.pc.Entity,
    scene: typingsSlinky.playcanvas.pc.Scene,
    renderer: typingsSlinky.playcanvas.pc.ForwardRenderer,
    assets: typingsSlinky.playcanvas.pc.AssetRegistry
  ) = this()
}
