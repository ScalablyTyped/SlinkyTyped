package typingsSlinky.antdMobileRn.abstractPickerMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractPicker
  extends Component[AbstractPickerProps, js.Any, js.Any] {
  
  def fixOnOk(cascader: js.Any): Unit = js.native
  
  def getPickerCol(): js.Array[ReactElement] = js.native
  
  def getSel(): js.UndefOr[String] = js.native
  
  def onOk(v: js.Any): Unit = js.native
  
  def onPickerChange(v: js.Any): Unit = js.native
  
  def onVisibleChange(visible: Boolean): Unit = js.native
  
  var scrollValue: js.Any = js.native
  
  def setCasecadeScrollValue(v: js.Any): Unit = js.native
  
  def setScrollValue(v: js.Any): Unit = js.native
}
