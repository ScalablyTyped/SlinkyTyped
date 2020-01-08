package typingsSlinky.jszip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jszipMod {
  import org.scalajs.dom.raw.Blob
  import typingsSlinky.node.NodeJS.ReadableStream

  type InputFileFormat = scala.scalajs.js.typedarray.ArrayBuffer | ReadableStream | String | Blob | js.Array[Double] | scala.scalajs.js.typedarray.Uint8Array
  type OnUpdateCallback = js.Function1[/* metadata */ Metadata, Unit]
}
