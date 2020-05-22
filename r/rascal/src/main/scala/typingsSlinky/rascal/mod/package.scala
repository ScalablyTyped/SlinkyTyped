package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AckOrNack = js.Function2[
    /* err */ js.UndefOr[js.Error], 
    /* recovery */ js.UndefOr[typingsSlinky.rascal.mod.Recovery | js.Array[typingsSlinky.rascal.mod.Recovery]], 
    scala.Unit
  ]
}
