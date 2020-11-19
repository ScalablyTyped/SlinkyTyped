package typingsSlinky.antdMobile.segmentedControlMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentedControl
  extends Component[SegmentedControlProps, js.Any, js.Any] {
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSegmentedControl(nextProps: SegmentedControlProps): Unit = js.native
  
  def onClick(e: SyntheticMouseEvent[HTMLDivElement], index: js.Any, value: js.Any): Unit = js.native
  
  def renderSegmentItem(idx: Double, value: String, selected: Boolean): ReactElement = js.native
}
