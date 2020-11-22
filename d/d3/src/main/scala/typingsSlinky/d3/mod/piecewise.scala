package typingsSlinky.d3.mod

import typingsSlinky.d3Interpolate.mod.ZoomInterpolator
import typingsSlinky.d3Interpolate.mod.ZoomView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "piecewise")
@js.native
object piecewise extends js.Object {
  
  def apply(
    interpolate: js.Function2[/* a */ ZoomView, /* b */ ZoomView, ZoomInterpolator],
    values: js.Array[ZoomView]
  ): ZoomInterpolator = js.native
  def apply(values: js.Array[ZoomView]): ZoomInterpolator = js.native
}
