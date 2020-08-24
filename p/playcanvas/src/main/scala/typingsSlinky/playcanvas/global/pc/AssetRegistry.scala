package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create an instance of an AssetRegistry.
  * Note: PlayCanvas scripts are provided with an AssetRegistry instance as 'app.assets'.
  * @property prefix - A URL prefix that will be added to all asset loading requests.
  * @param loader - The ResourceLoader used to load the asset files.
  */
@JSGlobal("pc.AssetRegistry")
@js.native
class AssetRegistry protected ()
  extends typingsSlinky.playcanvas.pc.AssetRegistry {
  def this(loader: typingsSlinky.playcanvas.pc.ResourceLoader) = this()
}

