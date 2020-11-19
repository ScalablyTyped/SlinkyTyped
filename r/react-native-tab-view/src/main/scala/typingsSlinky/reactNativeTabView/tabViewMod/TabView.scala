package typingsSlinky.reactNativeTabView.tabViewMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeTabView.anon.Layout
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabView[T /* <: Route */]
  extends Component[Props[T], State, js.Any] {
  
  var handleLayout: js.Any = js.native
  
  var jumpToIndex: js.Any = js.native
  
  @JSName("state")
  var state_TabView: Layout = js.native
}
