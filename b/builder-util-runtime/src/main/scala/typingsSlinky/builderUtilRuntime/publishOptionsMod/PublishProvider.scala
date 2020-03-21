package typingsSlinky.builderUtilRuntime.publishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.github
  - typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.bintray
  - typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.s3
  - typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.spaces
  - typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.generic
  - typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.custom
*/
trait PublishProvider extends js.Object

object PublishProvider {
  @scala.inline
  def bintray: typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.bintray = this.cast("bintray")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def custom: typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.custom = this.cast("custom")
  @scala.inline
  def generic: typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.generic = this.cast("generic")
  @scala.inline
  def github: typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.github = this.cast("github")
  @scala.inline
  def s3: typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.s3 = this.cast("s3")
  @scala.inline
  def spaces: typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.spaces = this.cast("spaces")
}

