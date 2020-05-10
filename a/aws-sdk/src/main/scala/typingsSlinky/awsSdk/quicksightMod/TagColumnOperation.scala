package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagColumnOperation extends js.Object {
  /**
    * The column that this operation acts on.
    */
  var ColumnName: typingsSlinky.awsSdk.quicksightMod.ColumnName = js.native
  /**
    * The dataset column tag, currently only used for geospatial type tagging. .  This is not tags for the AWS tagging feature. . 
    */
  var Tags: ColumnTagList = js.native
}

object TagColumnOperation {
  @scala.inline
  def apply(ColumnName: ColumnName, Tags: ColumnTagList): TagColumnOperation = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagColumnOperation]
  }
  @scala.inline
  implicit class TagColumnOperationOps[Self <: TagColumnOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnName(value: ColumnName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: ColumnTagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

