package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.IProjectConfig
  - typingsSlinky.ionic.definitionsMod.IMultiProjectConfig
*/
trait ProjectFile extends js.Object

object ProjectFile {
  @scala.inline
  implicit def apply(value: IMultiProjectConfig): ProjectFile = value.asInstanceOf[ProjectFile]
  @scala.inline
  implicit def apply(value: IProjectConfig): ProjectFile = value.asInstanceOf[ProjectFile]
}

