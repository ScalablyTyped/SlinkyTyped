package typingsSlinky.rrc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rrcMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.history.historyMod.Location
  import typingsSlinky.history.historyMod.LocationState
  import typingsSlinky.reactDashRouter.reactDashRouterMod.RouteProps
  import typingsSlinky.reactDashRouter.reactDashRouterMod.`match`
  import typingsSlinky.rrc.Anon_Inject

  type ComponentConstructor[Props] = ReactComponentClass[Props]
  type GetKeyFunction[Params] = js.Function3[
    /* match */ `match`[Params], 
    /* route */ RouteConfiguration, 
    /* location */ Location[LocationState], 
    String
  ]
  type IsActiveCallback = js.Function0[Boolean]
  type OnUpdateCall = js.Function1[/* location */ Location[LocationState], Unit]
  type PropIdCallback = js.Function0[String]
  type RouteConfiguration = RouteProps with Anon_Inject
  type WhenActiveReturnType[Props] = js.Function1[/* component */ ComponentConstructor[Props], ComponentConstructor[Props]]
}
