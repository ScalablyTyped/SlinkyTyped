package typingsSlinky.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cachefactory.cachefactoryStrings.memory
  - typingsSlinky.cachefactory.cachefactoryStrings.localStorage
  - typingsSlinky.cachefactory.cachefactoryStrings.sessionStorage
*/
trait StorageMode extends js.Object

object StorageMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localStorage: typingsSlinky.cachefactory.cachefactoryStrings.localStorage = this.cast("localStorage")
  @scala.inline
  def memory: typingsSlinky.cachefactory.cachefactoryStrings.memory = this.cast("memory")
  @scala.inline
  def sessionStorage: typingsSlinky.cachefactory.cachefactoryStrings.sessionStorage = this.cast("sessionStorage")
}

