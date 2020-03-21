package typingsSlinky.rcCascader.cascaderMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcCascader.AnonVisible
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends Component[CascaderProps, CascaderState, js.Any] {
  var defaultFieldNames: js.Object = js.native
  var trigger: js.Any = js.native
  def getActiveOptions(activeValue: js.Array[String]): js.Array[CascaderOption] = js.native
  def getCurrentLevelOptions(): js.Array[CascaderOption] = js.native
  def getFieldName(name: String): String = js.native
  def getFieldNames(): CascaderFieldNames = js.native
  def getPopupDOMNode(): js.Any = js.native
  def handleChange(options: js.Array[CascaderOption], hasVisible: AnonVisible, e: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
  def handleItemDoubleClick(): Unit = js.native
  def handleKeyDown(e: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
  def handleMenuSelect(targetOption: CascaderOption, menuIndex: Double, e: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
  def handlePopupVisibleChange(popupVisible: Boolean): Unit = js.native
  def saveTrigger(node: js.Any): Unit = js.native
  def setPopupVisible(popupVisible: Boolean): Unit = js.native
}

