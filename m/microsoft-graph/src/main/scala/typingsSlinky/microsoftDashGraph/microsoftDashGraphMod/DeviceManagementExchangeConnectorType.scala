package typingsSlinky.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.onPremises
  - typings.microsoftDashGraph.microsoftDashGraphStrings.hosted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.serviceToService
  - typings.microsoftDashGraph.microsoftDashGraphStrings.dedicated
*/
trait DeviceManagementExchangeConnectorType extends js.Object

object DeviceManagementExchangeConnectorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dedicated: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.dedicated = this.cast("dedicated")
  @scala.inline
  def hosted: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.hosted = this.cast("hosted")
  @scala.inline
  def onPremises: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.onPremises = this.cast("onPremises")
  @scala.inline
  def serviceToService: typingsSlinky.microsoftDashGraph.microsoftDashGraphStrings.serviceToService = this.cast("serviceToService")
}

