package typingsSlinky.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object refUtilsMod {
  type IRefCallback[T] = js.Function1[/* ref */ T | scala.Null, js.Any]
}
