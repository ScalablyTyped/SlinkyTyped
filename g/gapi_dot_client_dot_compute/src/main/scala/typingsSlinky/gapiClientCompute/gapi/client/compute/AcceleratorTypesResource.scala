package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorTypesResource extends js.Object {
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(request: Alt): Request[AcceleratorTypeAggregatedList] = js.native
  /** Returns the specified accelerator type. Get a list of available accelerator types by making a list() request. */
  def get(request: typingsSlinky.gapiClientCompute.anon.AcceleratorType): Request[AcceleratorType] = js.native
  /** Retrieves a list of accelerator types available to the specified project. */
  def list(request: Fields): Request[AcceleratorTypeList] = js.native
}

object AcceleratorTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[AcceleratorTypeAggregatedList],
    get: typingsSlinky.gapiClientCompute.anon.AcceleratorType => Request[AcceleratorType],
    list: Fields => Request[AcceleratorTypeList]
  ): AcceleratorTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AcceleratorTypesResource]
  }
  @scala.inline
  implicit class AcceleratorTypesResourceOps[Self <: AcceleratorTypesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: Alt => Request[AcceleratorTypeAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: typingsSlinky.gapiClientCompute.anon.AcceleratorType => Request[AcceleratorType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[AcceleratorTypeList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

