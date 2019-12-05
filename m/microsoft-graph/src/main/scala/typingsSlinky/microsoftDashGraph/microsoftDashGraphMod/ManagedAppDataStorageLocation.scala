package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.oneDriveForBusiness_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.oneDriveForBusiness_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.sharePoint
  - typings.microsoftDashGraph.microsoftDashGraphStrings.localStorage
*/
trait ManagedAppDataStorageLocation extends js.Object

object ManagedAppDataStorageLocation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localStorage: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.localStorage = this.cast("localStorage")
  @scala.inline
  def oneDriveForBusiness: oneDriveForBusiness_ = this.cast("oneDriveForBusiness")
  @scala.inline
  def sharePoint: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.sharePoint = this.cast("sharePoint")
}

