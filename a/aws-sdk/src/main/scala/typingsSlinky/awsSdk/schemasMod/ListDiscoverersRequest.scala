package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoverersRequest extends js.Object {
  var DiscovererIdPrefix: js.UndefOr[string] = js.native
  var Limit: js.UndefOr[integer] = js.native
  var NextToken: js.UndefOr[string] = js.native
  var SourceArnPrefix: js.UndefOr[string] = js.native
}

object ListDiscoverersRequest {
  @scala.inline
  def apply(): ListDiscoverersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoverersRequest]
  }
  @scala.inline
  implicit class ListDiscoverersRequestOps[Self <: ListDiscoverersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscovererIdPrefix(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscovererIdPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscovererIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiscovererIdPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: integer): Self = {
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
    def withNextToken(value: string): Self = {
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
    def withSourceArnPrefix(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArnPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArnPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArnPrefix")(js.undefined)
        ret
    }
  }
  
}

