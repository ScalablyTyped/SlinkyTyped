package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFunctionEventInvokeConfigsResponse extends js.Object {
  /**
    * A list of configurations.
    */
  var FunctionEventInvokeConfigs: js.UndefOr[FunctionEventInvokeConfigList] = js.native
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
}

object ListFunctionEventInvokeConfigsResponse {
  @scala.inline
  def apply(): ListFunctionEventInvokeConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionEventInvokeConfigsResponse]
  }
  @scala.inline
  implicit class ListFunctionEventInvokeConfigsResponseOps[Self <: ListFunctionEventInvokeConfigsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionEventInvokeConfigs(value: FunctionEventInvokeConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionEventInvokeConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionEventInvokeConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionEventInvokeConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
  }
  
}

