package typingsSlinky.antdDashMobile.libSegmentedDashControlMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentedControl
  extends Component[SegmentedControlProps, js.Any, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSegmentedControl(nextProps: SegmentedControlProps): Unit = js.native
  def onClick(e: SyntheticMouseEvent[HTMLDivElement], index: js.Any, value: js.Any): Unit = js.native
  def renderSegmentItem(idx: Double, value: String, selected: Boolean): Element = js.native
}

