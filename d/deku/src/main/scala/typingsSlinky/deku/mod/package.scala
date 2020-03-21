package typingsSlinky.deku

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Dispatch = js.Function1[/* action */ js.Any, js.Any]
  type Render = js.Function2[
    /* vnode */ typingsSlinky.deku.mod.VirtualElement, 
    /* context */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  /**
    * Thunk object passed to `element`
    */
  type Thunk = typingsSlinky.deku.mod.Component | (js.Function1[/* model */ typingsSlinky.deku.mod.Model, typingsSlinky.deku.mod.VirtualElement])
}
