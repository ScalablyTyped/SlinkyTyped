package typingsSlinky.d3.mod

import org.scalajs.dom.raw.TouchList
import typingsSlinky.d3Selection.mod.ContainerElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "touches")
@js.native
object touches extends js.Object {
  def apply(container: ContainerElement): js.Array[js.Tuple2[Double, Double]] = js.native
  def apply(container: ContainerElement, touches: TouchList): js.Array[js.Tuple2[Double, Double]] = js.native
}

