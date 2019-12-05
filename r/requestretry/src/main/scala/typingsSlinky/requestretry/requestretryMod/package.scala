package typingsSlinky.requestretry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestretryMod {
  import typingsSlinky.node.httpMod.IncomingMessage

  type RetryStrategy = js.Function3[/* err */ js.Error, /* response */ IncomingMessage, /* body */ js.Any, Boolean]
}
