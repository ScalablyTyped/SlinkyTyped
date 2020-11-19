package typingsSlinky.rcCascader.menusMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcCascader.cascaderMod.CascaderOption
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menus
  extends Component[MenusProps, js.Object, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MMenus(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenus(prevProps: MenusProps): Unit = js.native
  
  def delayOnSelect(onSelect: js.Any, args: js.Any*): Unit = js.native
  
  var delayTimer: Double = js.native
  
  def getActiveOptions(): js.Array[CascaderOption] = js.native
  def getActiveOptions(values: js.Array[CascaderOption]): js.Array[CascaderOption] = js.native
  
  def getFieldName(name: js.Any): js.Any = js.native
  
  def getOption(option: CascaderOption, menuIndex: Double): ReactElement = js.native
  
  def getShowOptions(): js.Array[js.Array[CascaderOption]] = js.native
  
  def isActiveOption(option: js.Any, menuIndex: js.Any): Boolean = js.native
  
  var menuItems: MenuItems = js.native
  
  def saveMenuItem(index: js.Any): js.Function1[/* node */ js.Any, Unit] = js.native
  
  def scrollActiveItemToView(): Unit = js.native
}
