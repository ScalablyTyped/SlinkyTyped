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
  def localStorage: typingsSlinky.cachefactory.cachefactoryStrings.localStorage = "localStorage".asInstanceOf[typingsSlinky.cachefactory.cachefactoryStrings.localStorage]
  @scala.inline
  def memory: typingsSlinky.cachefactory.cachefactoryStrings.memory = "memory".asInstanceOf[typingsSlinky.cachefactory.cachefactoryStrings.memory]
  @scala.inline
  def sessionStorage: typingsSlinky.cachefactory.cachefactoryStrings.sessionStorage = "sessionStorage".asInstanceOf[typingsSlinky.cachefactory.cachefactoryStrings.sessionStorage]
}

