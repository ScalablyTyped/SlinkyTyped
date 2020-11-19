package typingsSlinky.rmcTrigger.triggerMod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.rmcTrigger.propsTypeMod.ITriggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trigger
  extends Component[ITriggerProps with IProptypes, js.Any, js.Any] {
  
  var _component: js.Any = js.native
  
  var _container: js.Any = js.native
  
  def clearOutsideHandler(): Unit = js.native
  
  def close(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MTrigger(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTrigger(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTrigger(): Unit = js.native
  
  def getComponent(visible: js.Any): ReactElement = js.native
  
  def getContainer(): js.Any = js.native
  
  def getPopupAlign(): js.Any = js.native
  
  def getPopupClassNameFromAlign(align: js.Any): String = js.native
  
  def getPopupDomNode(): js.Any = js.native
  
  def getRootDomNode(): Element = js.native
  
  def onAnimateLeave(): Unit = js.native
  
  def onDocumentClick(event: js.Any): Unit = js.native
  
  var popupRef: js.Any = js.native
  
  def removeContainer(): Unit = js.native
  
  def renderDialog(visible: js.Any): Unit = js.native
  
  def saveRef(el: js.Any, visible: js.Any): Unit = js.native
  
  var touchOutsideHandler: js.Any = js.native
}
