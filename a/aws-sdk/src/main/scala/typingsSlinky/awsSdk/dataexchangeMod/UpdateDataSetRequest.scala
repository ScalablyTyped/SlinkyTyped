package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSetRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  /**
    * The description for the data set.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Description] = js.native
  /**
    * The name of the data set.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Name] = js.native
}

object UpdateDataSetRequest {
  @scala.inline
  def apply(DataSetId: string): UpdateDataSetRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSetRequest]
  }
  @scala.inline
  implicit class UpdateDataSetRequestOps[Self <: UpdateDataSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSetId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

