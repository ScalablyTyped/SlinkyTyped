package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFunctionsRequest extends js.Object {
  /**
    * Set to ALL to include entries for all published versions of each function.
    */
  var FunctionVersion: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.FunctionVersion] = js.native
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * For Lambda@Edge functions, the AWS Region of the master function. For example, us-east-1 filters the list of functions to only include Lambda@Edge functions replicated from a master function in US East (N. Virginia). If specified, you must set FunctionVersion to ALL.
    */
  var MasterRegion: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.MasterRegion] = js.native
  /**
    * The maximum number of functions to return.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.native
}

object ListFunctionsRequest {
  @scala.inline
  def apply(): ListFunctionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionsRequest]
  }
  @scala.inline
  implicit class ListFunctionsRequestOps[Self <: ListFunctionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionVersion(value: FunctionVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterRegion(value: MasterRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: MaxListItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(js.undefined)
        ret
    }
  }
  
}

