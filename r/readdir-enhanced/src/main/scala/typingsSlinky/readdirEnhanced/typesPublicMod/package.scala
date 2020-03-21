package typingsSlinky.readdirEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesPublicMod {
  type Callback[T] = js.Function2[/* err */ js.Error | scala.Null, /* result */ T, scala.Unit]
  type FilterFunction = js.Function1[/* stat */ typingsSlinky.readdirEnhanced.typesPublicMod.Stats, js.Any]
}
