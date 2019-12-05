package typingsSlinky.jpegDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jpegDashJsMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.std.ArrayLike

  type BufferLike = Buffer | scala.scalajs.js.typedarray.Uint8Array | ArrayLike[Double] | js.Iterable[Double] | scala.scalajs.js.typedarray.ArrayBuffer
  type BufferRet = RawImageData[Buffer]
  type ImageData = BufferRet | UintArrRet
  type UintArrRet = RawImageData[scala.scalajs.js.typedarray.Uint8Array]
}
