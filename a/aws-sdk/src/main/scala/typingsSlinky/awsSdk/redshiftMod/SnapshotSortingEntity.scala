package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotSortingEntity extends js.Object {
  /**
    * The category for sorting the snapshots.
    */
  var Attribute: SnapshotAttributeToSortBy = js.native
  /**
    * The order for listing the attributes.
    */
  var SortOrder: js.UndefOr[SortByOrder] = js.native
}

object SnapshotSortingEntity {
  @scala.inline
  def apply(Attribute: SnapshotAttributeToSortBy): SnapshotSortingEntity = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSortingEntity]
  }
  @scala.inline
  implicit class SnapshotSortingEntityOps[Self <: SnapshotSortingEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: SnapshotAttributeToSortBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortOrder(value: SortByOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(js.undefined)
        ret
    }
  }
  
}

