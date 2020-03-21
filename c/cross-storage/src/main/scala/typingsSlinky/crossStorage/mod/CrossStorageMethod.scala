package typingsSlinky.crossStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.crossStorage.crossStorageStrings.get
  - typingsSlinky.crossStorage.crossStorageStrings.set
  - typingsSlinky.crossStorage.crossStorageStrings.del
  - typingsSlinky.crossStorage.crossStorageStrings.getKeys
  - typingsSlinky.crossStorage.crossStorageStrings.clear
*/
trait CrossStorageMethod extends js.Object

object CrossStorageMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear: typingsSlinky.crossStorage.crossStorageStrings.clear = this.cast("clear")
  @scala.inline
  def del: typingsSlinky.crossStorage.crossStorageStrings.del = this.cast("del")
  @scala.inline
  def get: typingsSlinky.crossStorage.crossStorageStrings.get = this.cast("get")
  @scala.inline
  def getKeys: typingsSlinky.crossStorage.crossStorageStrings.getKeys = this.cast("getKeys")
  @scala.inline
  def set: typingsSlinky.crossStorage.crossStorageStrings.set = this.cast("set")
}

