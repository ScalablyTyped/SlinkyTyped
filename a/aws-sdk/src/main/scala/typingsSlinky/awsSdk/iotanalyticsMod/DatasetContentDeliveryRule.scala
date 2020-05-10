package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetContentDeliveryRule extends js.Object {
  /**
    * The destination to which data set contents are delivered.
    */
  var destination: DatasetContentDeliveryDestination = js.native
  /**
    * The name of the data set content delivery rules entry.
    */
  var entryName: js.UndefOr[EntryName] = js.native
}

object DatasetContentDeliveryRule {
  @scala.inline
  def apply(destination: DatasetContentDeliveryDestination): DatasetContentDeliveryRule = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetContentDeliveryRule]
  }
  @scala.inline
  implicit class DatasetContentDeliveryRuleOps[Self <: DatasetContentDeliveryRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: DatasetContentDeliveryDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryName(value: EntryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryName")(js.undefined)
        ret
    }
  }
  
}

