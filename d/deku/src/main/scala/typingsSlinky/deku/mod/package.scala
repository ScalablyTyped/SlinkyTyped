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
}
