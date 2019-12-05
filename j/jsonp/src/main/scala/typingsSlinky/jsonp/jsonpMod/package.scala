package typingsSlinky.jsonp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonpMod {
  type CancelFn = js.Function0[Unit]
  type RequestCallback = js.Function2[/* error */ js.Error | Null, /* data */ js.Any, Unit]
}
