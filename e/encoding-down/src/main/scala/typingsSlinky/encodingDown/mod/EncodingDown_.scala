package typingsSlinky.encodingDown.mod

import typingsSlinky.abstractLeveldown.mod.AbstractBatch
import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import typingsSlinky.abstractLeveldown.mod.ErrorValueCallback
import typingsSlinky.encodingDown.mod.EncodingDown.BatchOptions
import typingsSlinky.encodingDown.mod.EncodingDown.ChainedBatch
import typingsSlinky.encodingDown.mod.EncodingDown.DelOptions
import typingsSlinky.encodingDown.mod.EncodingDown.GetOptions
import typingsSlinky.encodingDown.mod.EncodingDown.IteratorOptions
import typingsSlinky.encodingDown.mod.EncodingDown.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingDown_[K, V] extends AbstractLevelDOWN[K, V] {
  def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): ChainedBatch[_, _] = js.native
  def del(key: K, options: DelOptions, cb: ErrorCallback): Unit = js.native
  def get(key: K, options: GetOptions, cb: ErrorValueCallback[V]): Unit = js.native
  def iterator(options: IteratorOptions): AbstractIterator[_, _] = js.native
  def put(key: K, value: V, options: PutOptions, cb: ErrorCallback): Unit = js.native
}

