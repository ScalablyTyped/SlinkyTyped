package typingsSlinky.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[TResponse] = js.Function2[/* err */ js.Error, /* res */ TResponse, scala.Unit]
}
