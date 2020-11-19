package typingsSlinky.pixiJs.mod.resources

import typingsSlinky.pixiJs.PIXI.ISize
import typingsSlinky.pixiJs.anon.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource type for SVG elements and graphics.
  * @class
  * @extends PIXI.resources.BaseImageResource
  * @memberof PIXI.resources
  * @param {string} source - Base64 encoded SVG element or URL for SVG file.
  * @param {object} [options] - Options to use
  * @param {number} [options.scale=1] - Scale to apply to SVG. Overridden by...
  * @param {number} [options.width] - Rasterize SVG this wide. Aspect ratio preserved if height not specified.
  * @param {number} [options.height] - Rasterize SVG this high. Aspect ratio preserved if width not specified.
  * @param {boolean} [options.autoLoad=true] - Start loading right away.
  */
@JSImport("pixi.js", "resources.SVGResource")
@js.native
class SVGResource protected ()
  extends typingsSlinky.pixiJs.PIXI.resources.SVGResource {
  def this(source: String) = this()
  def this(source: String, options: Scale) = this()
}
/* static members */
@JSImport("pixi.js", "resources.SVGResource")
@js.native
object SVGResource extends js.Object {
  
  /**
    * RegExp for SVG size.
    *
    * @static
    * @constant {RegExp|string} SVG_SIZE
    * @memberof PIXI.resources.SVGResource
    * @example &lt;svg width="100" height="100"&gt;&lt;/svg&gt;
    */
  val SVG_SIZE: js.RegExp | String = js.native
  
  /**
    * Get size from an svg string using regexp.
    *
    * @method
    * @param {string} svgString - a serialized svg element
    * @return {PIXI.ISize} image extension
    */
  def getSize(svgString: String): ISize = js.native
  
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {*} source - The source object
    * @param {string} extension - The extension of source, if set
    */
  def test(source: js.Any, extension: String): Unit = js.native
}
