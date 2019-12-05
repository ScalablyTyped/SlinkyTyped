package typingsSlinky.endDashOfDashStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object endDashOfDashStreamMod {
  import typingsSlinky.node.NodeJS.ReadableStream
  import typingsSlinky.node.NodeJS.WritableStream

  type Callback = js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  type Stream = ReadableStream | WritableStream
}
