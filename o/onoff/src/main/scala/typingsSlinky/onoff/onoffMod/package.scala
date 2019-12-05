package typingsSlinky.onoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onoffMod {
  import typingsSlinky.onoff.onoffNumbers.`0`
  import typingsSlinky.onoff.onoffNumbers.`1`

  type BinaryValue = High | Low
  type High = `1`
  type Low = `0`
  type ValueCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* value */ BinaryValue, Unit]
}
