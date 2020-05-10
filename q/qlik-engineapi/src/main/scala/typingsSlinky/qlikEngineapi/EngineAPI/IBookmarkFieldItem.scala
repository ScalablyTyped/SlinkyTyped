package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BookmarkFieldItem...
  */
@js.native
trait IBookmarkFieldItem extends js.Object {
  /**
    * If set to true, selections within a list object are made in AND mode;
    * If you have a list object that lists all customers, by selecting Customer 1 and
    * Customer 2 while in and-mode, all records that are associated with Customer 1 and Customer 2 are selected.
    *
    * The default value is false; selections within a list object are made in OR mode. If you have a list object
    * that lists all customers, by selecting Customer 1 and Customer 2 while in or-mode, all records that are
    * associated with either Customer 1 or Customer 2 are selected.
    * This parameter is not returned if set to false.
    */
  var qAndMode: Boolean = js.native
  /**
    * Name and type of the field
    */
  var qDef: IFieldDefEx = js.native
  /**
    * List of excluded values.
    * Either the list of selected values or the list of excluded values is displayed.
    */
  var qExcludedValues: js.Array[IFieldValue] = js.native
  /**
    * Indicates if the field is locked.
    * Default is false.
    */
  var qLocked: Boolean = js.native
  /**
    * If set to true, the field has always one selection (not 0 and not more than 1).
    * If another value is selected, the previous one is unselected.
    * The default value is false. This parameter is not returned if set to false.
    */
  var qOneAndOnlyOne: Boolean = js.native
  /**
    * Information on the selections criteria
    */
  var qSelectInfo: ISelectInfo = js.native
  /**
    * List of the selected values
    * Either the list of selected values or the list of excluded values is displayed.
    */
  var qValues: js.Array[IFieldValue] = js.native
}

object IBookmarkFieldItem {
  @scala.inline
  def apply(
    qAndMode: Boolean,
    qDef: IFieldDefEx,
    qExcludedValues: js.Array[IFieldValue],
    qLocked: Boolean,
    qOneAndOnlyOne: Boolean,
    qSelectInfo: ISelectInfo,
    qValues: js.Array[IFieldValue]
  ): IBookmarkFieldItem = {
    val __obj = js.Dynamic.literal(qAndMode = qAndMode.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qExcludedValues = qExcludedValues.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qOneAndOnlyOne = qOneAndOnlyOne.asInstanceOf[js.Any], qSelectInfo = qSelectInfo.asInstanceOf[js.Any], qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkFieldItem]
  }
  @scala.inline
  implicit class IBookmarkFieldItemOps[Self <: IBookmarkFieldItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAndMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAndMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDef(value: IFieldDefEx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQExcludedValues(value: js.Array[IFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExcludedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOneAndOnlyOne(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOneAndOnlyOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelectInfo(value: ISelectInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelectInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQValues(value: js.Array[IFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

