package typingsSlinky.encodingDashDown.encodingDashDownMod.EncodingDown

import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractChainedBatch
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractOptions
import typingsSlinky.levelDashCodec.levelDashCodecMod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainedBatch[K, V] extends AbstractChainedBatch[K, V] {
  def write(cb: js.Any): js.Any = js.native
  def write(options: CodecOptions with AbstractOptions, cb: js.Any): js.Any = js.native
}

