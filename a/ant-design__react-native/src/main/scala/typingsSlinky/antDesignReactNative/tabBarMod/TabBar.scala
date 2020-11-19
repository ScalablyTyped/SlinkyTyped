package typingsSlinky.antDesignReactNative.tabBarMod

import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.antDesignReactNative.tabBarStyleMod.TabBarStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBar
  extends Component[TabBarNativeProps, js.Any, js.Any] {
  
  def getPanes(styles: ReturnType[js.Function1[/* theme */ Theme, TabBarStyle]], content: Boolean): js.Array[_] = js.native
}
