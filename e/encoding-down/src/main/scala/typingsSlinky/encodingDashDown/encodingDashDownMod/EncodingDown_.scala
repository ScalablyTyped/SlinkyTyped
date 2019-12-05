package typingsSlinky.encodingDashDown.encodingDashDownMod

import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractBatch
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.ErrorValueCallback
import typingsSlinky.encodingDashDown.encodingDashDownMod.EncodingDown.BatchOptions
import typingsSlinky.encodingDashDown.encodingDashDownMod.EncodingDown.ChainedBatch
import typingsSlinky.encodingDashDown.encodingDashDownMod.EncodingDown.DelOptions
import typingsSlinky.encodingDashDown.encodingDashDownMod.EncodingDown.GetOptions
import typingsSlinky.encodingDashDown.encodingDashDownMod.EncodingDown.IteratorOptions
import typingsSlinky.encodingDashDown.encodingDashDownMod.EncodingDown.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("EncodingDown")
@js.native
trait EncodingDown_[K, V] extends AbstractLevelDOWN[K, V] {
  def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): ChainedBatch[_, _] = js.native
  def del(key: K, options: DelOptions, cb: ErrorCallback): Unit = js.native
  def get(key: K, options: GetOptions, cb: ErrorValueCallback[V]): Unit = js.native
  def iterator(options: IteratorOptions): AbstractIterator[_, _] = js.native
  def put(key: K, value: V, options: PutOptions, cb: ErrorCallback): Unit = js.native
}

