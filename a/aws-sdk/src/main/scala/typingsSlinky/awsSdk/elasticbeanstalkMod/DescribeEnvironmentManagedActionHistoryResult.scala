package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentManagedActionHistoryResult extends js.Object {
  /**
    * A list of completed and failed managed actions.
    */
  var ManagedActionHistoryItems: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ManagedActionHistoryItems] = js.native
  /**
    * A pagination token that you pass to DescribeEnvironmentManagedActionHistory to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeEnvironmentManagedActionHistoryResult {
  @scala.inline
  def apply(): DescribeEnvironmentManagedActionHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryResult]
  }
  @scala.inline
  implicit class DescribeEnvironmentManagedActionHistoryResultOps[Self <: DescribeEnvironmentManagedActionHistoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManagedActionHistoryItems(value: ManagedActionHistoryItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedActionHistoryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedActionHistoryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManagedActionHistoryItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
  }
  
}

