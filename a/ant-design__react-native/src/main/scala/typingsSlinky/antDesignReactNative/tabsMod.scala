package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.TypeofDefaultTabBar
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.PropsType
import typingsSlinky.antDesignReactNative.tabsTabsMod.Tabs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/tabs", JSImport.Namespace)
@js.native
object tabsMod extends js.Object {
  @js.native
  class default protected () extends Tabs {
    def this(props: PropsType) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DefaultTabBar: TypeofDefaultTabBar = js.native
    var defaultProps: PropsType = js.native
  }
  
}

