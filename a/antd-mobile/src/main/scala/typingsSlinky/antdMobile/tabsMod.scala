package typingsSlinky.antdMobile

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.anon.PrefixCls
import typingsSlinky.antdMobile.anon.TypeofDefaultTabBar
import typingsSlinky.antdMobile.tabsPropsTypeMod.TabsProps
import typingsSlinky.react.mod.Component
import typingsSlinky.rmcTabs.propsTypeMod.TabBarPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/tabs", JSImport.Namespace)
@js.native
object tabsMod extends js.Object {
  
  @js.native
  class DefaultTabBar ()
    extends typingsSlinky.rmcTabs.mod.DefaultTabBar
  /* static members */
  @js.native
  object DefaultTabBar extends js.Object {
    
    var defaultProps: js.Any = js.native
  }
  
  @js.native
  trait Tabs
    extends Component[TabsProps, js.Object, js.Any] {
    
    def renderTabBar(props: TabBarPropsType): ReactElement = js.native
  }
  
  @js.native
  class default () extends Tabs
  /* static members */
  @js.native
  object default extends js.Object {
    
    var DefaultTabBar: TypeofDefaultTabBar = js.native
    
    var defaultProps: PrefixCls = js.native
  }
}
