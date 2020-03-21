package typingsSlinky.rocksdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RocksDB {
  type Bytes = java.lang.String | typingsSlinky.node.Buffer
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* size */ scala.Double, scala.Unit]
  // tslint:disable-next-line:no-empty-interface
  type OpenOptions = typingsSlinky.abstractLeveldown.mod.AbstractOpenOptions
}
