package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.NodeJS.ArrayBufferView

  type CompressCallback = js.Function2[/* error */ js.Error | Null, /* result */ Buffer, Unit]
  type InputType = String | scala.scalajs.js.typedarray.ArrayBuffer | ArrayBufferView
}
