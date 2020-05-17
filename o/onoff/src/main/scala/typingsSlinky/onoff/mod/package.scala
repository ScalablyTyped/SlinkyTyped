package typingsSlinky.onoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type High = typingsSlinky.onoff.onoffNumbers.`1`
  type Low = typingsSlinky.onoff.onoffNumbers.`0`
  type ValueCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* value */ typingsSlinky.onoff.mod.BinaryValue, 
    scala.Unit
  ]
}
