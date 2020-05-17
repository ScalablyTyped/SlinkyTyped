package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.machinelearningMod.BatchPredictionFilterVariable
import typingsSlinky.awsSdk.machinelearningMod.ComparatorValue
import typingsSlinky.awsSdk.machinelearningMod.PageLimit
import typingsSlinky.awsSdk.machinelearningMod.SortOrder
import typingsSlinky.awsSdk.machinelearningMod.StringType
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/machinelearning.DescribeBatchPredictionsInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeBatchPredictionsI extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The equal to operator. The BatchPrediction results will have FilterVariable values that exactly match the value specified with EQ.
    */
  var EQ: js.UndefOr[ComparatorValue] = js.native
  /**
    * Use one of the following variables to filter a list of BatchPrediction:   CreatedAt - Sets the search criteria to the BatchPrediction creation date.  Status - Sets the search criteria to the BatchPrediction status.  Name - Sets the search criteria to the contents of the BatchPrediction  Name.  IAMUser - Sets the search criteria to the user account that invoked the BatchPrediction creation.  MLModelId - Sets the search criteria to the MLModel used in the BatchPrediction.  DataSourceId - Sets the search criteria to the DataSource used in the BatchPrediction.  DataURI - Sets the search criteria to the data file(s) used in the BatchPrediction. The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory. 
    */
  var FilterVariable: js.UndefOr[BatchPredictionFilterVariable] = js.native
  /**
    * The greater than or equal to operator. The BatchPrediction results will have FilterVariable values that are greater than or equal to the value specified with GE. 
    */
  var GE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The greater than operator. The BatchPrediction results will have FilterVariable values that are greater than the value specified with GT.
    */
  var GT: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than or equal to operator. The BatchPrediction results will have FilterVariable values that are less than or equal to the value specified with LE.
    */
  var LE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than operator. The BatchPrediction results will have FilterVariable values that are less than the value specified with LT.
    */
  var LT: js.UndefOr[ComparatorValue] = js.native
  /**
    * The number of pages of information to include in the result. The range of acceptable values is 1 through 100. The default value is 100.
    */
  var Limit: js.UndefOr[PageLimit] = js.native
  /**
    * The not equal to operator. The BatchPrediction results will have FilterVariable values not equal to the value specified with NE.
    */
  var NE: js.UndefOr[ComparatorValue] = js.native
  /**
    * An ID of the page in the paginated results.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  /**
    * A string that is found at the beginning of a variable, such as Name or Id. For example, a Batch Prediction operation could have the Name 2014-09-09-HolidayGiftMailer. To search for this BatchPrediction, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
    */
  var Prefix: js.UndefOr[ComparatorValue] = js.native
  /**
    * A two-value parameter that determines the sequence of the resulting list of MLModels.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.SortOrder] = js.native
}

object DescribeBatchPredictionsI {
  @scala.inline
  def apply(): DescribeBatchPredictionsI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBatchPredictionsI]
  }
  @scala.inline
  implicit class DescribeBatchPredictionsIOps[Self <: DescribeBatchPredictionsI] (val x: Self) extends AnyVal {
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
    def withFilterVariable(value: BatchPredictionFilterVariable): Self = {
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

