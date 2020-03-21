package typingsSlinky.reactSwipe.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSwipe
  extends Component[Props, js.Object, js.Any] {
  def getNumSlides(): Double = js.native
  def getPos(): Double = js.native
  def next(): Unit = js.native
  def prev(): Unit = js.native
  def slide(index: Double, duration: Double): Unit = js.native
}

