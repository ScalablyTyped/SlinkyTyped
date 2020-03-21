package typingsSlinky.browserfs.keyValueFilesystemMod

import typingsSlinky.browserfs.browserfsStrings.readonly
import typingsSlinky.browserfs.browserfsStrings.readwrite
import typingsSlinky.browserfs.fileSystemMod.BFSOneArgCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncKeyValueStore extends js.Object {
  def beginTransaction(`type`: String): AsyncKeyValueROTransaction = js.native
  /**
    * Begins a read-only transaction.
    */
  @JSName("beginTransaction")
  def beginTransaction_readonly(`type`: readonly): AsyncKeyValueROTransaction = js.native
  /**
    * Begins a read-write transaction.
    */
  @JSName("beginTransaction")
  def beginTransaction_readwrite(`type`: readwrite): AsyncKeyValueRWTransaction = js.native
  /**
    * Empties the key-value store completely.
    */
  def clear(cb: BFSOneArgCallback): Unit = js.native
  /**
    * The name of the key-value store.
    */
  def name(): String = js.native
}

