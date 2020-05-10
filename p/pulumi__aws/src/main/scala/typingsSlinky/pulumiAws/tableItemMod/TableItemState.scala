package typingsSlinky.pulumiAws.tableItemMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableItemState extends js.Object {
  /**
    * Hash key to use for lookups and identification of the item
    */
  val hashKey: js.UndefOr[Input[String]] = js.native
  /**
    * JSON representation of a map of attribute name/value pairs, one for each attribute.
    * Only the primary key attributes are required; you can optionally provide other attribute name-value pairs for the item.
    */
  val item: js.UndefOr[Input[String]] = js.native
  /**
    * Range key to use for lookups and identification of the item. Required if there is range key defined in the table.
    */
  val rangeKey: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the table to contain the item.
    */
  val tableName: js.UndefOr[Input[String]] = js.native
}

object TableItemState {
  @scala.inline
  def apply(): TableItemState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableItemState]
  }
  @scala.inline
  implicit class TableItemStateOps[Self <: TableItemState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashKey")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableName")(js.undefined)
        ret
    }
  }
  
}

