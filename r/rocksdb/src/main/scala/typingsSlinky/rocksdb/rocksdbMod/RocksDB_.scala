package typingsSlinky.rocksdb.rocksdbMod

import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractBatch
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractChainedBatch
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import typingsSlinky.abstractDashLeveldown.abstractDashLeveldownMod.ErrorValueCallback
import typingsSlinky.rocksdb.rocksdbMod.RocksDB.BatchOptions
import typingsSlinky.rocksdb.rocksdbMod.RocksDB.Bytes
import typingsSlinky.rocksdb.rocksdbMod.RocksDB.DelOptions
import typingsSlinky.rocksdb.rocksdbMod.RocksDB.ErrorSizeCallback
import typingsSlinky.rocksdb.rocksdbMod.RocksDB.GetOptions
import typingsSlinky.rocksdb.rocksdbMod.RocksDB.Iterator
import typingsSlinky.rocksdb.rocksdbMod.RocksDB.IteratorOptions
import typingsSlinky.rocksdb.rocksdbMod.RocksDB.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("RocksDB")
@js.native
trait RocksDB_ extends AbstractLevelDOWN[Bytes, Bytes] {
  def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): Unit = js.native
  def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): AbstractChainedBatch[Bytes, Bytes] = js.native
  def compactRange(start: Bytes, end: Bytes, cb: ErrorCallback): Unit = js.native
  def del(key: Bytes, options: DelOptions, cb: ErrorCallback): Unit = js.native
  def destroy(location: String, cb: ErrorCallback): Unit = js.native
  def get(key: Bytes, options: GetOptions, cb: ErrorValueCallback[Bytes]): Unit = js.native
  def getProperty(property: String): String = js.native
  def iterator(options: IteratorOptions): Iterator = js.native
  def put(key: Bytes, value: Bytes, options: PutOptions, cb: ErrorCallback): Unit = js.native
  def repair(location: String, cb: ErrorCallback): Unit = js.native
}

