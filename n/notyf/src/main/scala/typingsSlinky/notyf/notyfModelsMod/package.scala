package typingsSlinky.notyf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notyfModelsMod {
  type NotyfArrayEventFn[T] = js.Function3[
    /* elem */ T, 
    /* event */ typingsSlinky.notyf.notyfModelsMod.NotyfArrayEvent, 
    /* elems */ js.Array[T], 
    scala.Unit
  ]
}
