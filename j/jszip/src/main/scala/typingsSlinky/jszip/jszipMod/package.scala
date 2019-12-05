package typingsSlinky.jszip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jszipMod {
  import org.scalajs.dom.raw.Blob
  import typingsSlinky.node.NodeJS.ReadableStream

  type InputFileFormat = String | scala.scalajs.js.typedarray.Uint8Array | js.Array[Double] | ReadableStream | scala.scalajs.js.typedarray.ArrayBuffer | Blob
  type OnUpdateCallback = js.Function1[/* metadata */ Metadata, Unit]
}
