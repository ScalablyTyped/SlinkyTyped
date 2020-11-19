package typingsSlinky.plottable

import typingsSlinky.plottable.interfacesMod.SimpleSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils/colorUtils", JSImport.Namespace)
@js.native
object colorUtilsMod extends js.Object {
  
  def colorTest(colorTester: SimpleSelection[_], className: String): String = js.native
  
  def contrast(a: String, b: String): Double = js.native
  
  def lightenColor(color: String, factor: Double): String = js.native
}
