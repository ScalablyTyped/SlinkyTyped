package typingsSlinky.honeybadger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object honeybadgerMod {
  type CallbackFunction = js.Function2[/* err */ js.Error | Null, /* notice */ js.Object | Null, Unit]
  type LambdaHandler = js.Function2[/* event */ js.Object, /* context */ js.Object, Unit]
}
