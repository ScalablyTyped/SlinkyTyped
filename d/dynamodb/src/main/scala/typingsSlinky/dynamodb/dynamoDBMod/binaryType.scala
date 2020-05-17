package typingsSlinky.dynamodb.dynamoDBMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - js.Object
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.DataView
  - typingsSlinky.std.Int8Array
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.Uint8ClampedArray
  - typingsSlinky.std.Int16Array
  - typingsSlinky.std.Uint16Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint32Array
  - typingsSlinky.std.Float32Array
  - typingsSlinky.std.Float64Array
  - typingsSlinky.node.streamMod.Stream
*/
trait binaryType extends js.Object

object binaryType {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: Buffer): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.DataView): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Float64Array): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Int16Array): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Int8Array): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.Object): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: Stream): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint16Array): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint32Array): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): binaryType = value.asInstanceOf[binaryType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8ClampedArray): binaryType = value.asInstanceOf[binaryType]
}

