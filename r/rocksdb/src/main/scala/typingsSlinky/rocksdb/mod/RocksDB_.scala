package typingsSlinky.rocksdb.mod

import typingsSlinky.abstractLeveldown.mod.AbstractBatch
import typingsSlinky.abstractLeveldown.mod.AbstractChainedBatch
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import typingsSlinky.abstractLeveldown.mod.ErrorValueCallback
import typingsSlinky.rocksdb.mod.RocksDB.BatchOptions
import typingsSlinky.rocksdb.mod.RocksDB.Bytes
import typingsSlinky.rocksdb.mod.RocksDB.DelOptions
import typingsSlinky.rocksdb.mod.RocksDB.ErrorSizeCallback
import typingsSlinky.rocksdb.mod.RocksDB.GetOptions
import typingsSlinky.rocksdb.mod.RocksDB.Iterator
import typingsSlinky.rocksdb.mod.RocksDB.IteratorOptions
import typingsSlinky.rocksdb.mod.RocksDB.PutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
