package typingsSlinky.phaser.global.MatterJS

import org.scalajs.dom.raw.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Svg` module contains methods for converting SVG images into an array of vector points.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Svg
  */
@JSGlobal("MatterJS.Svg")
@js.native
class Svg ()
  extends typingsSlinky.phaser.MatterJS.Svg
/* static members */
@JSGlobal("MatterJS.Svg")
@js.native
object Svg extends js.Object {
  
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
  def pathToVertices(path: SVGPathElement, sampleLength: Double): js.Array[typingsSlinky.phaser.MatterJS.Vector] = js.native
}
