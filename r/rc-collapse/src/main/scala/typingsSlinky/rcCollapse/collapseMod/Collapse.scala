package typingsSlinky.rcCollapse.collapseMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcCollapse.interfaceMod.CollapseProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collapse
  extends Component[CollapseProps, CollapseState, js.Any] {
  
  def getItems(): js.Array[ReactElement] = js.native
  
  def getNewChild(child: ReactElement, index: Double): ReactElement = js.native
  
  def onClickItem(key: Key): Unit = js.native
  
  def setActiveKey(activeKey: js.Array[Key]): Unit = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCollapse(nextProps: CollapseProps, nextState: CollapseState): Boolean = js.native
}
