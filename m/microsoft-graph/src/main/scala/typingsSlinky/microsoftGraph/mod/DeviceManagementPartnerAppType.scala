package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.singleTenantApp
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.multiTenantApp
*/
trait DeviceManagementPartnerAppType extends js.Object

object DeviceManagementPartnerAppType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multiTenantApp: typingsSlinky.microsoftGraph.microsoftGraphStrings.multiTenantApp = this.cast("multiTenantApp")
  @scala.inline
  def singleTenantApp: typingsSlinky.microsoftGraph.microsoftGraphStrings.singleTenantApp = this.cast("singleTenantApp")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

