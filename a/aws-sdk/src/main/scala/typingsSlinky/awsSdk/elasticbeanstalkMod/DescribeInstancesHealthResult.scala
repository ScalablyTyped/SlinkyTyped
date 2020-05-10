package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancesHealthResult extends js.Object {
  /**
    * Detailed health information about each instance. The output differs slightly between Linux and Windows environments. There is a difference in the members that are supported under the &lt;CPUUtilization&gt; type.
    */
  var InstanceHealthList: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.InstanceHealthList] = js.native
  /**
    * Pagination token for the next page of results, if available.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.NextToken] = js.native
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[js.Date] = js.native
}

object DescribeInstancesHealthResult {
  @scala.inline
  def apply(): DescribeInstancesHealthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesHealthResult]
  }
  @scala.inline
  implicit class DescribeInstancesHealthResultOps[Self <: DescribeInstancesHealthResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceHealthList(value: InstanceHealthList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceHealthList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceHealthList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceHealthList")(js.undefined)
        ret
    }
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
    def withRefreshedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshedAt")(js.undefined)
        ret
    }
  }
  
}

