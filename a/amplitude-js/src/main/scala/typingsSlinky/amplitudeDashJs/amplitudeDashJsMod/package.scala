package typingsSlinky.amplitudeDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amplitudeDashJsMod {
  import typingsSlinky.amplitudeDashJs.Anon_Reason

  type Callback = js.Function3[
    /* responseCode */ Double, 
    /* responseBody */ String, 
    /* details */ js.UndefOr[Anon_Reason], 
    Unit
  ]
  type LogReturn = Double | Unit
}
