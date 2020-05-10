package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSSLPoliciesOutput extends js.Object {
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  /**
    * Information about the security policies.
    */
  var SslPolicies: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.SslPolicies] = js.native
}

object DescribeSSLPoliciesOutput {
  @scala.inline
  def apply(): DescribeSSLPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSSLPoliciesOutput]
  }
  @scala.inline
  implicit class DescribeSSLPoliciesOutputOps[Self <: DescribeSSLPoliciesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextMarker(value: Marker): Self = {
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
    @scala.inline
    def withSslPolicies(value: SslPolicies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslPolicies")(js.undefined)
        ret
    }
  }
  
}

