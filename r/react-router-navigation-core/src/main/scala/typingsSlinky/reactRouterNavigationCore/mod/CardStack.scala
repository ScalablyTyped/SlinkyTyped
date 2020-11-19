package typingsSlinky.reactRouterNavigationCore.mod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.Component
import typingsSlinky.reactRouterNavigationCore.anon.Cards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-router-navigation-core", "CardStack")
@js.native
class CardStack protected ()
  extends Component[CardStackProps, Cards, js.Any] {
  def this(props: CardStackProps) = this()
  def this(props: CardStackProps, context: js.Any) = this()
  
  def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
  
  // Pop to previous scene (n-1)
  def onNavigateBack(): Boolean = js.native
  
  def unlistenHistory(): Unit = js.native
}
