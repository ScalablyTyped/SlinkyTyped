package typingsSlinky.d3.mod

import org.scalajs.dom.raw.TouchList
import typingsSlinky.d3Selection.mod.ContainerElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "touch")
@js.native
object touch extends js.Object {
  
  def apply(container: ContainerElement, identifier: Double): (js.Tuple2[Double, Double]) | Null = js.native
  def apply(container: ContainerElement, touches: TouchList, identifier: Double): (js.Tuple2[Double, Double]) | Null = js.native
}
