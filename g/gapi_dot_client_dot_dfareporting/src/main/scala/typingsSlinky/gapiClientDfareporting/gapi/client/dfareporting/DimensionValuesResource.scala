package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValuesResource extends js.Object {
  /** Retrieves list of report dimension values for a list of filters. */
  def query(request: AnonUserIp): Request_[DimensionValueList]
}

object DimensionValuesResource {
  @scala.inline
  def apply(query: AnonUserIp => Request_[DimensionValueList]): DimensionValuesResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[DimensionValuesResource]
  }
}

