package typingsSlinky.pixiJs.mod

import typingsSlinky.pixiJs.PIXI.resources.Resource
import typingsSlinky.std.HTMLCanvasElement
import typingsSlinky.std.HTMLImageElement
import typingsSlinky.std.HTMLVideoElement
import typingsSlinky.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Texture that depends on six other resources.
  *
  * @class
  * @extends PIXI.BaseTexture
  * @memberof PIXI
  */
@JSImport("pixi.js", "CubeTexture")
@js.native
class CubeTexture ()
  extends typingsSlinky.pixiJs.PIXI.CubeTexture

/* static members */
@JSImport("pixi.js", "CubeTexture")
@js.native
object CubeTexture extends js.Object {
  def from(resources: String): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: String, options: js.Any): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
  /**
    * Generate a new CubeTexture.
    * @static
    * @param {string[]|PIXI.resources.Resource[]} resources - Collection of 6 URLs or resources
    * @param {object} [options] - Optional options passed to the resources being loaded.
    *        See {@PIXI.resources.autoDetectResource autoDetectResource} for more info
    *        on the options available to each resource.
    * @returns {PIXI.CubeTexture} new cube texture
    */
  def from(resources: js.Array[Resource | String]): typingsSlinky.pixiJs.PIXI.CubeTexture = js.native
  def from(resources: js.Array[Resource | String], options: js.Any): typingsSlinky.pixiJs.PIXI.CubeTexture = js.native
  def from(resources: HTMLCanvasElement): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLCanvasElement, options: js.Any): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLImageElement): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLImageElement, options: js.Any): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLVideoElement): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLVideoElement, options: js.Any): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: SVGElement): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: SVGElement, options: js.Any): typingsSlinky.pixiJs.PIXI.BaseTexture = js.native
}

