package typingsSlinky.antdMobileRn

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarDemoBasicNativeMod {
  
  @JSImport("antd-mobile-rn/lib/tab-bar/demo/basic.native", JSImport.Default)
  @js.native
  class default protected () extends BasicTabBarExample {
    def this(props: js.Any) = this()
  }
  
  @js.native
  trait BasicTabBarExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onChangeTab(tabName: js.Any): Unit = js.native
    
    def renderContent(pageText: js.Any): ReactElement = js.native
  }
}
