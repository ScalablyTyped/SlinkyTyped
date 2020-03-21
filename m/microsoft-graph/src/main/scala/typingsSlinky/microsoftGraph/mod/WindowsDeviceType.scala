package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.desktop
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.mobile
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.holographic
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.team
*/
trait WindowsDeviceType extends js.Object

object WindowsDeviceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop: typingsSlinky.microsoftGraph.microsoftGraphStrings.desktop = this.cast("desktop")
  @scala.inline
  def holographic: typingsSlinky.microsoftGraph.microsoftGraphStrings.holographic = this.cast("holographic")
  @scala.inline
  def mobile: typingsSlinky.microsoftGraph.microsoftGraphStrings.mobile = this.cast("mobile")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def team: typingsSlinky.microsoftGraph.microsoftGraphStrings.team = this.cast("team")
}

