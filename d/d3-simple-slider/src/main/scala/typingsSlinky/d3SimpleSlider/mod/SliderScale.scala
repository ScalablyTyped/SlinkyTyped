package typingsSlinky.d3SimpleSlider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderScale[Domain] extends js.Object {
  var tickFormat: js.UndefOr[
    js.Function2[
      /* count */ js.UndefOr[Double], 
      /* specifier */ js.UndefOr[String], 
      js.Function1[/* d */ Double, String]
    ]
  ] = js.native
  var ticks: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], js.Array[Domain]]] = js.native
  def apply(x: Domain): js.UndefOr[Double] = js.native
  def copy(): this.type = js.native
  def domain(): js.Array[Domain] = js.native
  def range(): js.Array[Double] = js.native
}

