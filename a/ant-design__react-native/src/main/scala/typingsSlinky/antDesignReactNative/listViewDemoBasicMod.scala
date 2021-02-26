package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.Layout
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listViewDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/list-view/demo/basic", JSImport.Default)
  @js.native
  class default () extends BasicListExample
  
  @JSImport("@ant-design/react-native/lib/list-view/demo/basic", "description")
  @js.native
  val description: /* "ListView Example" */ String = js.native
  
  @JSImport("@ant-design/react-native/lib/list-view/demo/basic", "title")
  @js.native
  val title: /* "ListView" */ String = js.native
  
  @js.native
  trait BasicListExample
    extends Component[js.Any, js.Any, js.Any] {
    
    def onFetch(
      page: js.UndefOr[scala.Nothing],
      startFetch: js.Function2[/* arg0 */ js.Array[String], /* arg1 */ Double, Unit],
      abortFetch: js.Function0[Unit]
    ): js.Promise[Unit] = js.native
    def onFetch(
      page: Double,
      startFetch: js.Function2[/* arg0 */ js.Array[String], /* arg1 */ Double, Unit],
      abortFetch: js.Function0[Unit]
    ): js.Promise[Unit] = js.native
    
    def renderItem(item: js.Any): ReactElement = js.native
    
    def sleep(time: js.Any): js.Promise[_] = js.native
    
    @JSName("state")
    var state_BasicListExample: Layout = js.native
  }
}
