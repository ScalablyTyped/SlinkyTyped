package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.other
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.home
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.work
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.blog
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.profile
*/
trait WebsiteType extends js.Object

object WebsiteType {
  @scala.inline
  def blog: typingsSlinky.microsoftGraph.microsoftGraphStrings.blog = this.cast("blog")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def home: typingsSlinky.microsoftGraph.microsoftGraphStrings.home = this.cast("home")
  @scala.inline
  def other: typingsSlinky.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def profile: typingsSlinky.microsoftGraph.microsoftGraphStrings.profile = this.cast("profile")
  @scala.inline
  def work: typingsSlinky.microsoftGraph.microsoftGraphStrings.work = this.cast("work")
}

