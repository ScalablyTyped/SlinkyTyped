package typingsSlinky.jszip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InputFileFormat = org.scalajs.dom.raw.Blob | java.lang.String | js.typedarray.ArrayBuffer | typingsSlinky.node.NodeJS.ReadableStream | js.Array[scala.Double] | js.typedarray.Uint8Array
  type OnUpdateCallback = js.Function1[/* metadata */ typingsSlinky.jszip.mod.Metadata, scala.Unit]
}
