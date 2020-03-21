package typingsSlinky.rrc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentConstructor[Props] = slinky.core.ReactComponentClass[Props]
  type GetKeyFunction[Params] = js.Function3[
    /* match */ typingsSlinky.reactRouter.mod.`match`[Params], 
    /* route */ typingsSlinky.rrc.mod.RouteConfiguration, 
    /* location */ typingsSlinky.history.mod.Location[typingsSlinky.history.mod.LocationState], 
    java.lang.String
  ]
  type IsActiveCallback = js.Function0[scala.Boolean]
  type OnUpdateCall = js.Function1[
    /* location */ typingsSlinky.history.mod.Location[typingsSlinky.history.mod.LocationState], 
    scala.Unit
  ]
  type PropIdCallback = js.Function0[java.lang.String]
  type WhenActiveReturnType[Props] = js.Function1[
    /* component */ typingsSlinky.rrc.mod.ComponentConstructor[Props], 
    typingsSlinky.rrc.mod.ComponentConstructor[Props]
  ]
}
