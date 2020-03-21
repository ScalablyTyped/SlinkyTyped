package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.onPremises
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.hosted
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.serviceToService
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.dedicated
*/
trait DeviceManagementExchangeConnectorType extends js.Object

object DeviceManagementExchangeConnectorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dedicated: typingsSlinky.microsoftGraph.microsoftGraphStrings.dedicated = this.cast("dedicated")
  @scala.inline
  def hosted: typingsSlinky.microsoftGraph.microsoftGraphStrings.hosted = this.cast("hosted")
  @scala.inline
  def onPremises: typingsSlinky.microsoftGraph.microsoftGraphStrings.onPremises = this.cast("onPremises")
  @scala.inline
  def serviceToService: typingsSlinky.microsoftGraph.microsoftGraphStrings.serviceToService = this.cast("serviceToService")
}

