package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVoicesOutput extends js.Object {
  /**
    * The pagination token to use in the next request to continue the listing of voices. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.pollyMod.NextToken] = js.native
  /**
    * A list of voices with their properties.
    */
  var Voices: js.UndefOr[VoiceList] = js.native
}

object DescribeVoicesOutput {
  @scala.inline
  def apply(): DescribeVoicesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVoicesOutput]
  }
  @scala.inline
  implicit class DescribeVoicesOutputOps[Self <: DescribeVoicesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withVoices(value: VoiceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Voices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Voices")(js.undefined)
        ret
    }
  }
  
}

