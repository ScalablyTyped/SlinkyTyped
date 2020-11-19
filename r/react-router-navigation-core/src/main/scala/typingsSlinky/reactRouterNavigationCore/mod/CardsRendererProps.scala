package typingsSlinky.reactRouterNavigationCore.mod

import typingsSlinky.reactRouterNavigationCore.anon.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardsRendererProps extends js.Object {
  
  var cards: js.Array[Card] = js.native
  
  var navigationState: NavigationState[Params] = js.native
  
  def onNavigateBack(): Boolean = js.native
  def onNavigateBack(routeKey: String): Boolean = js.native
}
