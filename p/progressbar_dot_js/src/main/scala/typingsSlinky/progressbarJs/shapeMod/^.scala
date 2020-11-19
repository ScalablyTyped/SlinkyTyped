package typingsSlinky.progressbarJs.shapeMod

import org.scalajs.dom.raw.SVGPathElement
import typingsSlinky.progressbarJs.mod.PathDrawingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-empty-interface adds members from animation contract
@JSImport("progressbar.js/shape", JSImport.Namespace)
@js.native
/**
  * `Line`, `Circle` or `SemiCircle` shaped progress bar. Appends SVG to container.
  * @param container - Element where SVG is added.
  * @param [opts] - Options for path drawing.
  * @see {@link https://progressbarjs.readthedocs.io/en/latest/api/shape/#new-shapecontainer-options}
  */
class ^ () extends Shape {
  def this(container: String) = this()
  def this(container: SVGPathElement) = this()
  def this(container: String, opts: PathDrawingOptions) = this()
  def this(container: Null, opts: PathDrawingOptions) = this()
  def this(container: SVGPathElement, opts: PathDrawingOptions) = this()
}
