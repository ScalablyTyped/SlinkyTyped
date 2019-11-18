package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.Error
  import typingsSlinky.node.NodeJS.ArrayBufferView
  import typingsSlinky.std.ArrayBuffer

  type CompressCallback = js.Function2[/* error */ Error | Null, /* result */ Buffer, Unit]
  type InputType = java.lang.String | ArrayBuffer | ArrayBufferView
}
