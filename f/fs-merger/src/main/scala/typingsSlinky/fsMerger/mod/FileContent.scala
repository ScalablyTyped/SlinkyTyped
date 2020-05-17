package typingsSlinky.fsMerger.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - scala.Null
*/
trait FileContent extends js.Object

object FileContent {
  @scala.inline
  implicit def apply(value: Buffer): FileContent = value.asInstanceOf[FileContent]
  @scala.inline
  implicit def apply(value: Null): FileContent = value.asInstanceOf[FileContent]
  @scala.inline
  implicit def apply(value: String): FileContent = value.asInstanceOf[FileContent]
}

