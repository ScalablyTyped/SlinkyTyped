package typingsSlinky.antDesignReactNative.listViewMod

import typingsSlinky.antDesignReactNative.anon.Refresh
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListView[T]
  extends Component[ListViewProps[T], ListViewState, js.Any] {
  
  def refresh(): Unit = js.native
  
  var ulv: Refresh = js.native
}
