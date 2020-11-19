package typingsSlinky.pixiJs.PIXI.resources

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.pixiJs.PIXI.BaseTexture
import typingsSlinky.pixiJs.PIXI.GLTexture
import typingsSlinky.pixiJs.PIXI.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base for all the image/canvas resources
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  */
@js.native
trait BaseImageResource extends Resource {
  
  /**
    * The source element
    * @member {HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|SVGElement} PIXI.resources.BaseImageResource#source
    * @readonly
    */
  val source: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement = js.native
  
  /**
    * Upload the texture to the GPU.
    * @param {PIXI.Renderer} renderer - Upload to the renderer
    * @param {PIXI.BaseTexture} baseTexture - Reference to parent texture
    * @param {PIXI.GLTexture} glTexture
    * @param {HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|SVGElement} [source] (optional)
    * @returns {boolean} true is success
    */
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean = js.native
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLCanvasElement): Boolean = js.native
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLImageElement): Boolean = js.native
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLVideoElement): Boolean = js.native
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: SVGElement): Boolean = js.native
}
