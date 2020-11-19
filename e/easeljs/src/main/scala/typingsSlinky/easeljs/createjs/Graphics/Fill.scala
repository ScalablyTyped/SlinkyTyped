package typingsSlinky.easeljs.createjs.Graphics

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.easeljs.createjs.Matrix2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fill extends js.Object {
  
  // methods
  def bitmap(image: HTMLImageElement): Fill = js.native
  def bitmap(image: HTMLImageElement, repetition: String): Fill = js.native
  
  def linearGradient(colors: js.Array[Double], ratios: js.Array[Double], x0: Double, y0: Double, x1: Double, y1: Double): Fill = js.native
  
  var matrix: Matrix2D = js.native
  
  def radialGradient(
    colors: js.Array[Double],
    ratios: js.Array[Double],
    x0: Double,
    y0: Double,
    r0: Double,
    x1: Double,
    y1: Double,
    r1: Double
  ): Fill = js.native
  
  // properties
  var style: js.Object = js.native
}
