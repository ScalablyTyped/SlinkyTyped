package typingsSlinky.maxmind.decoderMod

import typingsSlinky.maxmind.mod.OpenOpts
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/decoder", JSImport.Default)
@js.native
class default protected () extends Decoder {
  def this(db: Buffer) = this()
  def this(db: Buffer, baseOffset: Double) = this()
  def this(db: Buffer, baseOffset: Double, opts: OpenOpts) = this()
}

