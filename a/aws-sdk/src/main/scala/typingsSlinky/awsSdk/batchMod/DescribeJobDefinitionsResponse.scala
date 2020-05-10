package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobDefinitionsResponse extends js.Object {
  /**
    * The list of job definitions.
    */
  var jobDefinitions: js.UndefOr[JobDefinitionList] = js.native
  /**
    * The nextToken value to include in a future DescribeJobDefinitions request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeJobDefinitionsResponse {
  @scala.inline
  def apply(): DescribeJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobDefinitionsResponse]
  }
  @scala.inline
  implicit class DescribeJobDefinitionsResponseOps[Self <: DescribeJobDefinitionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobDefinitions(value: JobDefinitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

