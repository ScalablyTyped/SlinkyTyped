package typingsSlinky.memfs.volumeMod

import typingsSlinky.memfs.encodingMod.TDataOut
import typingsSlinky.memfs.encodingMod.TEncodingExtended
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs/lib/volume", "bufferToEncoding")
@js.native
object bufferToEncoding extends js.Object {
  def apply(buffer: Buffer): TDataOut = js.native
  def apply(buffer: Buffer, encoding: TEncodingExtended): TDataOut = js.native
}

