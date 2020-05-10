package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFields
import typingsSlinky.gapiClientCompute.AnonMachineType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineTypesResource extends js.Object {
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(request: AnonAlt): Request_[MachineTypeAggregatedList] = js.native
  /** Returns the specified machine type. Get a list of available machine types by making a list() request. */
  def get(request: AnonMachineType): Request_[MachineType] = js.native
  /** Retrieves a list of machine types available to the specified project. */
  def list(request: AnonFields): Request_[MachineTypeList] = js.native
}

object MachineTypesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[MachineTypeAggregatedList],
    get: AnonMachineType => Request_[MachineType],
    list: AnonFields => Request_[MachineTypeList]
  ): MachineTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MachineTypesResource]
  }
  @scala.inline
  implicit class MachineTypesResourceOps[Self <: MachineTypesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[MachineTypeAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonMachineType => Request_[MachineType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[MachineTypeList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

