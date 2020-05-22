package typingsSlinky.jpegJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BufferLike = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.std.ArrayLike[scala.Double] | js.Iterable[scala.Double] | js.typedarray.ArrayBuffer
  type BufferRet = typingsSlinky.jpegJs.mod.RawImageData[typingsSlinky.node.Buffer]
  type ImageData = typingsSlinky.jpegJs.mod.BufferRet | typingsSlinky.jpegJs.mod.UintArrRet
  type UintArrRet = typingsSlinky.jpegJs.mod.RawImageData[js.typedarray.Uint8Array]
}
