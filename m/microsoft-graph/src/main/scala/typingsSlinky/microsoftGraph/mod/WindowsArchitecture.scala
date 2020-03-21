package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.x86
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.x64
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.arm
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.neutral
*/
trait WindowsArchitecture extends js.Object

object WindowsArchitecture {
  @scala.inline
  def arm: typingsSlinky.microsoftGraph.microsoftGraphStrings.arm = this.cast("arm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neutral: typingsSlinky.microsoftGraph.microsoftGraphStrings.neutral = this.cast("neutral")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def x64: typingsSlinky.microsoftGraph.microsoftGraphStrings.x64 = this.cast("x64")
  @scala.inline
  def x86: typingsSlinky.microsoftGraph.microsoftGraphStrings.x86 = this.cast("x86")
}

