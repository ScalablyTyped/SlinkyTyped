package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.oneDriveForBusiness_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.oneDriveForBusiness_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.sharePoint
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.localStorage
*/
trait ManagedAppDataStorageLocation extends js.Object

object ManagedAppDataStorageLocation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localStorage: typingsSlinky.microsoftGraph.microsoftGraphStrings.localStorage = this.cast("localStorage")
  @scala.inline
  def oneDriveForBusiness: oneDriveForBusiness_ = this.cast("oneDriveForBusiness")
  @scala.inline
  def sharePoint: typingsSlinky.microsoftGraph.microsoftGraphStrings.sharePoint = this.cast("sharePoint")
}

