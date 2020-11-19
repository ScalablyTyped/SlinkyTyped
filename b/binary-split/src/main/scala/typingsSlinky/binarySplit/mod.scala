package typingsSlinky.binarySplit

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("binary-split", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Split streams of binary data.
    * @param splitOn The matcher for the splitting points in the stream. Default: os.EOL
    */
  def apply(): Transform = js.native
  def apply(splitOn: String): Transform = js.native
  def apply(splitOn: js.Array[js.BigInt | Double]): Transform = js.native
  def apply(splitOn: js.Object): Transform = js.native
  def apply(splitOn: Buffer): Transform = js.native
  def apply(splitOn: js.typedarray.ArrayBuffer): Transform = js.native
  def apply(splitOn: SharedArrayBuffer): Transform = js.native
  def apply(splitOn: js.typedarray.Uint8Array): Transform = js.native
}
