package typingsSlinky.builderUtil.archMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.builderUtil.builderUtilStrings.x64
  - typingsSlinky.builderUtil.builderUtilStrings.ia32
  - typingsSlinky.builderUtil.builderUtilStrings.armv7l
  - typingsSlinky.builderUtil.builderUtilStrings.arm64
*/
trait ArchType extends js.Object

object ArchType {
  @scala.inline
  def arm64: typingsSlinky.builderUtil.builderUtilStrings.arm64 = this.cast("arm64")
  @scala.inline
  def armv7l: typingsSlinky.builderUtil.builderUtilStrings.armv7l = this.cast("armv7l")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typingsSlinky.builderUtil.builderUtilStrings.ia32 = this.cast("ia32")
  @scala.inline
  def x64: typingsSlinky.builderUtil.builderUtilStrings.x64 = this.cast("x64")
}

