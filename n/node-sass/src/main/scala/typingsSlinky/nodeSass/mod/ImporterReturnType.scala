package typingsSlinky.nodeSass.mod

import typingsSlinky.nodeSass.anon.Contents
import typingsSlinky.nodeSass.anon.File
import typingsSlinky.nodeSass.mod.types.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSass.anon.File
  - typingsSlinky.nodeSass.anon.Contents
  - typingsSlinky.std.Error
  - scala.Null
  - typingsSlinky.nodeSass.mod.types.Null
  - typingsSlinky.nodeSass.mod.types.Error
*/
trait ImporterReturnType extends js.Object

object ImporterReturnType {
  @scala.inline
  implicit def apply(value: Contents): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
  @scala.inline
  implicit def apply(value: Error): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
  @scala.inline
  implicit def apply(value: js.Error): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
  @scala.inline
  implicit def apply(value: File): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
  @scala.inline
  implicit def apply(value: Null): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodeSass.mod.types.Null): ImporterReturnType = value.asInstanceOf[ImporterReturnType]
}

