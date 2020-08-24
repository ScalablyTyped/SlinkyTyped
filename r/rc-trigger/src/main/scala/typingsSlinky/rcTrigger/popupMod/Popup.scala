package typingsSlinky.rcTrigger.popupMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.rcTrigger.anon.LeavedClassName
import typingsSlinky.rcTrigger.anon.PartialPopupState
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.rcTrigger.interfaceMod.Point
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup
  extends Component[PopupProps, PopupState, js.Any] {
  var alignRef: ReactRef[AlignRefType] = js.native
  var nextFrameId: js.Any = js.native
  var nextFrameState: js.Any = js.native
  var popupRef: ReactRef[HTMLDivElement] = js.native
  def cancelFrameState(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPopup(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPopup(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPopup(): Unit = js.native
  def getAlignTarget(): Point | js.Function0[HTMLElement] = js.native
  def getMotion(): LeavedClassName = js.native
  def getZIndexStyle(): CSSProperties = js.native
  def onAlign(popupDomNode: HTMLElement, align: AlignType): Unit = js.native
  def onMotionEnd(): Unit = js.native
  def renderMaskElement(): ReactElement = js.native
  def renderPopupElement(): ReactElement = js.native
  def setStateOnNextFrame(state: PartialPopupState): Unit = js.native
}

