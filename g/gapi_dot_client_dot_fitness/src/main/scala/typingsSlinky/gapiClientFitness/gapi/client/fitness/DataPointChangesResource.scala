package typingsSlinky.gapiClientFitness.gapi.client.fitness

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFitness.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPointChangesResource extends js.Object {
  /** Queries for user's data point changes for a particular data source. */
  def list(request: AnonAlt): Request_[ListDataPointChangesResponse] = js.native
}

object DataPointChangesResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[ListDataPointChangesResponse]): DataPointChangesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DataPointChangesResource]
  }
  @scala.inline
  implicit class DataPointChangesResourceOps[Self <: DataPointChangesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonAlt => Request_[ListDataPointChangesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

