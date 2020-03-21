package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FOLDER
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FILE
  - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.OTHER
*/
trait FolderItemType extends js.Object

object FolderItemType {
  @scala.inline
  def FILE: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FILE = this.cast("FILE")
  @scala.inline
  def FOLDER: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.FOLDER = this.cast("FOLDER")
  @scala.inline
  def OTHER: typingsSlinky.qlikEngineapi.qlikEngineapiStrings.OTHER = this.cast("OTHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

