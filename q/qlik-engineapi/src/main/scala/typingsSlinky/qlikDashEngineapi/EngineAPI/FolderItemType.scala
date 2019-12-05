package typingsSlinky.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.FOLDER
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.FILE
  - typings.qlikDashEngineapi.qlikDashEngineapiStrings.OTHER
*/
trait FolderItemType extends js.Object

object FolderItemType {
  @scala.inline
  def FILE: typingsSlinky.qlikDashEngineapi.qlikDashEngineapiStrings.FILE = this.cast("FILE")
  @scala.inline
  def FOLDER: typingsSlinky.qlikDashEngineapi.qlikDashEngineapiStrings.FOLDER = this.cast("FOLDER")
  @scala.inline
  def OTHER: typingsSlinky.qlikDashEngineapi.qlikDashEngineapiStrings.OTHER = this.cast("OTHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

