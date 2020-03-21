package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.appsInListCompliant
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.appsNotInListCompliant
*/
trait AppListType extends js.Object

object AppListType {
  @scala.inline
  def appsInListCompliant: typingsSlinky.microsoftGraph.microsoftGraphStrings.appsInListCompliant = this.cast("appsInListCompliant")
  @scala.inline
  def appsNotInListCompliant: typingsSlinky.microsoftGraph.microsoftGraphStrings.appsNotInListCompliant = this.cast("appsNotInListCompliant")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
}

