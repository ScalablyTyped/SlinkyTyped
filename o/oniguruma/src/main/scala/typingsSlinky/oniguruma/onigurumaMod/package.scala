package typingsSlinky.oniguruma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onigurumaMod {
  type Callback[T] = js.Function2[/* error */ js.Error, /* match */ T, Unit]
}
