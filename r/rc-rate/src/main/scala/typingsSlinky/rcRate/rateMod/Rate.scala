package typingsSlinky.rcRate.rateMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLUListElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rate
  extends Component[RateProps, RateState, js.Any] {
  var onKeyDown: KeyboardEventHandler[HTMLUListElement] = js.native
  var rate: HTMLUListElement = js.native
  var stars: Record[String, typingsSlinky.rcRate.starMod.default] = js.native
  def blur(): Unit = js.native
  def changeValue(value: Double): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRate(): Unit = js.native
  def focus(): Unit = js.native
  def getStarDOM(index: Double): HTMLElement = js.native
  def getStarValue(index: Double, x: Double): Double = js.native
  def onBlur(): Unit = js.native
  def onClick(event: SyntheticKeyboardEvent[Element], index: Double): Unit = js.native
  def onClick(event: SyntheticMouseEvent[Element], index: Double): Unit = js.native
  def onFocus(): Unit = js.native
  def onHover(event: SyntheticMouseEvent[HTMLDivElement], index: Double): Unit = js.native
  def onMouseLeave(): Unit = js.native
  def saveRate(node: HTMLUListElement): Unit = js.native
  def saveRef(index: Double): js.Function1[/* node */ typingsSlinky.rcRate.starMod.default, Unit] = js.native
}

