package typingsSlinky.pixiJs.mod.resources

import typingsSlinky.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource type for ImageBitmap.
  * @class
  * @extends PIXI.resources.BaseImageResource
  * @memberof PIXI.resources
  * @param {ImageBitmap} source - Image element to use
  */
@JSImport("pixi.js", "resources.ImageBitmapResource")
@js.native
class ImageBitmapResource protected ()
  extends typingsSlinky.pixiJs.PIXI.resources.ImageBitmapResource {
  def this(source: ImageBitmap) = this()
}

/* static members */
@JSImport("pixi.js", "resources.ImageBitmapResource")
@js.native
object ImageBitmapResource extends js.Object {
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {ImageBitmap} source - The source object
    * @return {boolean} `true` if source is an ImageBitmap
    */
  def test(source: ImageBitmap): Boolean = js.native
}

