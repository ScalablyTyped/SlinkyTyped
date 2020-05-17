package typingsSlinky.jszip.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Blob
  - java.lang.String
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.node.NodeJS.ReadableStream
  - js.Array[scala.Double]
  - typingsSlinky.std.Uint8Array
*/
trait InputFileFormat extends js.Object

object InputFileFormat {
  @scala.inline
  implicit def apply(value: js.Array[Double]): InputFileFormat = value.asInstanceOf[InputFileFormat]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): InputFileFormat = value.asInstanceOf[InputFileFormat]
  @scala.inline
  implicit def apply(value: Blob): InputFileFormat = value.asInstanceOf[InputFileFormat]
  @scala.inline
  implicit def apply(value: ReadableStream): InputFileFormat = value.asInstanceOf[InputFileFormat]
  @scala.inline
  implicit def apply(value: String): InputFileFormat = value.asInstanceOf[InputFileFormat]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): InputFileFormat = value.asInstanceOf[InputFileFormat]
}

