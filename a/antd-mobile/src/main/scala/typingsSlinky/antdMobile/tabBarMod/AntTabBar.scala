package typingsSlinky.antdMobile.tabBarMod

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.tabBarPropsTypeMod.TabBarItemProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntTabBar
  extends Component[AntTabbarProps, js.Any, js.Any] {
  
  def getTabs(): js.Array[TabBarItemProps] = js.native
  
  def renderTabBar(): ReactElement = js.native
}
