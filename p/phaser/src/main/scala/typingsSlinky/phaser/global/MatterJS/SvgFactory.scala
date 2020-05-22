package typingsSlinky.phaser.global.MatterJS

import org.scalajs.dom.raw.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MatterJS.SvgFactory")
@js.native
class SvgFactory ()
  extends typingsSlinky.phaser.MatterJS.SvgFactory {
  /**
    * Converts an SVG path into an array of vector points.
    * If the input path forms a concave shape, you must decompose the result into convex parts before use.
    * See `Bodies.fromVertices` which provides support for this.
    * Note that this function is not guaranteed to support complex paths (such as those with holes).
    * @method pathToVertices
    * @param {SVGPathElement} path
    * @param {Number} [sampleLength=15]
    * @return {Vector[]} points
    */
  /* CompleteClass */
  override def pathToVertices(path: SVGPathElement, sampleLength: Double): js.Array[typingsSlinky.phaser.MatterJS.Vector] = js.native
}

