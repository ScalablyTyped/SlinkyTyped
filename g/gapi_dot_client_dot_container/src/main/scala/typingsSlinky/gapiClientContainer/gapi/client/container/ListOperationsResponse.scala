package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperationsResponse extends js.Object {
  /**
    * If any zones are listed here, the list of operations returned
    * may be missing the operations from those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
  /** A list of operations in the project in the specified zone. */
  var operations: js.UndefOr[js.Array[Operation]] = js.native
}

object ListOperationsResponse {
  @scala.inline
  def apply(): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsResponse]
  }
  @scala.inline
  implicit class ListOperationsResponseOps[Self <: ListOperationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissingZones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingZones")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: js.Array[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
  }
  
}

