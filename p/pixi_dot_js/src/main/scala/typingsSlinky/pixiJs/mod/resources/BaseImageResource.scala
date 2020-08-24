package typingsSlinky.pixiJs.mod.resources

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base for all the image/canvas resources
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  */
@JSImport("pixi.js", "resources.BaseImageResource")
@js.native
class BaseImageResource protected ()
  extends typingsSlinky.pixiJs.PIXI.resources.BaseImageResource {
  def this(source: HTMLCanvasElement) = this()
  def this(source: HTMLImageElement) = this()
  def this(source: HTMLVideoElement) = this()
  def this(source: SVGElement) = this()
}

/* static members */
@JSImport("pixi.js", "resources.BaseImageResource")
@js.native
object BaseImageResource extends js.Object {
  /**
    * Set cross origin based detecting the url and the crossorigin
    * @protected
    * @param {HTMLElement} element - Element to apply crossOrigin
    * @param {string} url - URL to check
    * @param {boolean|string} [crossorigin=true] - Cross origin value to use
    */
  /* protected */ def crossOrigin(element: HTMLElement, url: String): Unit = js.native
  /* protected */ def crossOrigin(element: HTMLElement, url: String, crossorigin: String): Unit = js.native
  /* protected */ def crossOrigin(element: HTMLElement, url: String, crossorigin: Boolean): Unit = js.native
}

