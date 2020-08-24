package typingsSlinky.pixiJs.global.PIXI.resources

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource type for HTMLCanvasElement.
  * @class
  * @extends PIXI.resources.BaseImageResource
  * @memberof PIXI.resources
  * @param {HTMLCanvasElement} source - Canvas element to use
  */
@JSGlobal("PIXI.resources.CanvasResource")
@js.native
class CanvasResource protected ()
  extends typingsSlinky.pixiJs.PIXI.resources.CanvasResource {
  def this(source: HTMLCanvasElement) = this()
}

/* static members */
@JSGlobal("PIXI.resources.CanvasResource")
@js.native
object CanvasResource extends js.Object {
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {HTMLCanvasElement|OffscreenCanvas} source - The source object
    * @return {boolean} `true` if source is HTMLCanvasElement or OffscreenCanvas
    */
  def test(source: HTMLCanvasElement): Boolean = js.native
  def test(source: OffscreenCanvas): Boolean = js.native
}

