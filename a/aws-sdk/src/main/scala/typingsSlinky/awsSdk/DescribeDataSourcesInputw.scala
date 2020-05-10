package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.machinelearningMod.ComparatorValue
import typingsSlinky.awsSdk.machinelearningMod.DataSourceFilterVariable
import typingsSlinky.awsSdk.machinelearningMod.PageLimit
import typingsSlinky.awsSdk.machinelearningMod.SortOrder
import typingsSlinky.awsSdk.machinelearningMod.StringType
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/machinelearning.DescribeDataSourcesInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeDataSourcesInputw extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The equal to operator. The DataSource results will have FilterVariable values that exactly match the value specified with EQ.
    */
  var EQ: js.UndefOr[ComparatorValue] = js.native
  /**
    * Use one of the following variables to filter a list of DataSource:   CreatedAt - Sets the search criteria to DataSource creation dates.  Status - Sets the search criteria to DataSource statuses.  Name - Sets the search criteria to the contents of DataSource   Name.  DataUri - Sets the search criteria to the URI of data files used to create the DataSource. The URI can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.  IAMUser - Sets the search criteria to the user account that invoked the DataSource creation. 
    */
  var FilterVariable: js.UndefOr[DataSourceFilterVariable] = js.native
  /**
    * The greater than or equal to operator. The DataSource results will have FilterVariable values that are greater than or equal to the value specified with GE. 
    */
  var GE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The greater than operator. The DataSource results will have FilterVariable values that are greater than the value specified with GT.
    */
  var GT: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than or equal to operator. The DataSource results will have FilterVariable values that are less than or equal to the value specified with LE.
    */
  var LE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than operator. The DataSource results will have FilterVariable values that are less than the value specified with LT.
    */
  var LT: js.UndefOr[ComparatorValue] = js.native
  /**
    *  The maximum number of DataSource to include in the result.
    */
  var Limit: js.UndefOr[PageLimit] = js.native
  /**
    * The not equal to operator. The DataSource results will have FilterVariable values not equal to the value specified with NE.
    */
  var NE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The ID of the page in the paginated results.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  /**
    * A string that is found at the beginning of a variable, such as Name or Id. For example, a DataSource could have the Name 2014-09-09-HolidayGiftMailer. To search for this DataSource, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
    */
  var Prefix: js.UndefOr[ComparatorValue] = js.native
  /**
    * A two-value parameter that determines the sequence of the resulting list of DataSource.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.SortOrder] = js.native
}

object DescribeDataSourcesInputw {
  @scala.inline
  def apply(): DescribeDataSourcesInputw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSourcesInputw]
  }
  @scala.inline
  implicit class DescribeDataSourcesInputwOps[Self <: DescribeDataSourcesInputw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEQ(value: ComparatorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EQ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EQ")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterVariable(value: DataSourceFilterVariable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withGE(value: ComparatorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GE")(js.undefined)
        ret
    }
    @scala.inline
    def withGT(value: ComparatorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GT")(js.undefined)
        ret
    }
    @scala.inline
    def withLE(value: ComparatorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LE")(js.undefined)
        ret
    }
    @scala.inline
    def withLT(value: ComparatorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LT")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: PageLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNE(value: ComparatorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NE")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: ComparatorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: SortOrder): Self = {
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

