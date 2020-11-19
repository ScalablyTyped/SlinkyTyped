package typingsSlinky.paper.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.paper.paper.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paper", "Raster")
@js.native
/** 
  * Creates a new raster item from the passed argument, and places it in the
  * active layer. `source` can either be a DOM Image, a Canvas, or a string
  * describing the URL to load the image from, or the ID of a DOM element to
  * get the image from (either a DOM Image or a Canvas).
  * 
  * @param source - the source of
  *     the raster
  * @param position - the center position at which the raster item is
  *     placed
  */
class Raster ()
  extends typingsSlinky.paper.paper.Raster {
  def this(source: String) = this()
  def this(source: HTMLCanvasElement) = this()
  def this(source: HTMLImageElement) = this()
  def this(source: js.UndefOr[scala.Nothing], position: Point) = this()
  def this(source: String, position: Point) = this()
  def this(source: HTMLCanvasElement, position: Point) = this()
  def this(source: HTMLImageElement, position: Point) = this()
}
