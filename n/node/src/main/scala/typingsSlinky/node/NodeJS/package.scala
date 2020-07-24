package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJS {
  type ArrayBufferView = typingsSlinky.node.NodeJS.TypedArray | js.typedarray.DataView
  type Dict[T] = org.scalablytyped.runtime.StringDictionary[js.UndefOr[T]]
  type ReadOnlyDict[T] = org.scalablytyped.runtime.StringDictionary[js.UndefOr[T]]
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
}
