package typingsSlinky.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait FilterOptions extends js.Object {
  /**
    * To return only resources that have CreationDate AFTER this date
    */
  var AfterDate: js.UndefOr[Timestamp] = js.native
  /**
    * To return only resources that have CreationDate BEFORE this date
    */
  var BeforeDate: js.UndefOr[Timestamp] = js.native
  /**
    * The column to sort against and direction - only CreationDate (or Date for the events) is available and ASC or DESC for the direction
    */
  var Sort: js.UndefOr[ColumnAndDirection] = js.native
}

object FilterOptions {
  @scala.inline
  def apply(): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOptions]
  }
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterDate")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeforeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeforeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: ColumnAndDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(js.undefined)
        ret
    }
  }
  
}

