package typingsSlinky.pixiJs.mod.resources

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.pixiJs.anon.CreateBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource type for HTMLImageElement.
  * @class
  * @extends PIXI.resources.BaseImageResource
  * @memberof PIXI.resources
  */
@JSImport("pixi.js", "resources.ImageResource")
@js.native
class ImageResource protected ()
  extends typingsSlinky.pixiJs.PIXI.resources.ImageResource {
  def this(source: String) = this()
  def this(source: HTMLImageElement) = this()
  def this(source: String, options: CreateBitmap) = this()
  def this(source: HTMLImageElement, options: CreateBitmap) = this()
}

/* static members */
@JSImport("pixi.js", "resources.ImageResource")
@js.native
object ImageResource extends js.Object {
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {string|HTMLImageElement} source - The source object
    * @return {boolean} `true` if source is string or HTMLImageElement
    */
  def test(source: String): Boolean = js.native
  def test(source: HTMLImageElement): Boolean = js.native
}

