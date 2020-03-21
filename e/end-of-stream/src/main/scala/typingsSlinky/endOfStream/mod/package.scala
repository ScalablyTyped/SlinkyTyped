package typingsSlinky.endOfStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* error */ js.UndefOr[js.Error | scala.Null], scala.Unit]
  type Stream = typingsSlinky.node.NodeJS.ReadableStream | typingsSlinky.node.NodeJS.WritableStream
}
