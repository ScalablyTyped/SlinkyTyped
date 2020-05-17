package typingsSlinky.sass.mod

import typingsSlinky.sass.anon.Contents
import typingsSlinky.sass.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sass.anon.File
  - typingsSlinky.sass.anon.Contents
  - typingsSlinky.std.Error
  - scala.Null
*/
trait ImporterReturnType extends js.Object

object ImporterReturnType {
  @scala.inline
  implicit def apply(value: Contents): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
  @scala.inline
  implicit def apply(value: js.Error): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
  @scala.inline
  implicit def apply(value: File): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
  @scala.inline
  implicit def apply(value: Null): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
}

