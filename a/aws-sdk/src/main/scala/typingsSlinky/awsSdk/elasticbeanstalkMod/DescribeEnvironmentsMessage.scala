package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentsMessage extends js.Object {
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified IDs.
    */
  var EnvironmentIds: js.UndefOr[EnvironmentIdList] = js.native
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that have the specified names.
    */
  var EnvironmentNames: js.UndefOr[EnvironmentNamesList] = js.native
  /**
    * Indicates whether to include deleted environments:  true: Environments that have been deleted after IncludedDeletedBackTo are displayed.  false: Do not include deleted environments.
    */
  var IncludeDeleted: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.IncludeDeleted] = js.native
  /**
    *  If specified when IncludeDeleted is set to true, then environments deleted after this date are displayed. 
    */
  var IncludedDeletedBackTo: js.UndefOr[js.Date] = js.native
  /**
    * For a paginated request. Specify a maximum number of environments to include in each response. If no MaxRecords is specified, all available environments are retrieved in a single response.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.MaxRecords] = js.native
  /**
    * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All other parameter values must be identical to the ones specified in the initial request. If no NextToken is specified, the first page is retrieved.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those that are associated with this application version.
    */
  var VersionLabel: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}

object DescribeEnvironmentsMessage {
  @scala.inline
  def apply(): DescribeEnvironmentsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentsMessage]
  }
  @scala.inline
  implicit class DescribeEnvironmentsMessageOps[Self <: DescribeEnvironmentsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentIds(value: EnvironmentIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentNames(value: EnvironmentNamesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentNames")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDeleted(value: IncludeDeleted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludedDeletedBackTo(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludedDeletedBackTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedDeletedBackTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludedDeletedBackTo")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRecords(value: MaxRecords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
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
    def withVersionLabel(value: VersionLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(js.undefined)
        ret
    }
  }
  
}

