package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionValuesResource extends js.Object {
  /** Retrieves list of report dimension values for a list of filters. */
  def query(request: UserIp): Request[DimensionValueList] = js.native
}

object DimensionValuesResource {
  @scala.inline
  def apply(query: UserIp => Request[DimensionValueList]): DimensionValuesResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[DimensionValuesResource]
  }
  @scala.inline
  implicit class DimensionValuesResourceOps[Self <: DimensionValuesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: UserIp => Request[DimensionValueList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

