package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCasesRequest extends js.Object {
  /**
    * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var afterTime: js.UndefOr[AfterTime] = js.native
  /**
    * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var beforeTime: js.UndefOr[BeforeTime] = js.native
  /**
    * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
    */
  var caseIdList: js.UndefOr[CaseIdList] = js.native
  /**
    * The ID displayed for a case in the AWS Support Center user interface.
    */
  var displayId: js.UndefOr[DisplayId] = js.native
  /**
    * Specifies whether communications should be included in the DescribeCases results. The default is true.
    */
  var includeCommunications: js.UndefOr[IncludeCommunications] = js.native
  /**
    * Specifies whether resolved support cases should be included in the DescribeCases results. The default is false.
    */
  var includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.native
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * The maximum number of results to return before paginating.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeCasesRequest {
  @scala.inline
  def apply(): DescribeCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCasesRequest]
  }
  @scala.inline
  implicit class DescribeCasesRequestOps[Self <: DescribeCasesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterTime(value: AfterTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeTime(value: BeforeTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseIdList(value: CaseIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseIdList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseIdList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseIdList")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayId(value: DisplayId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayId")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeCommunications(value: IncludeCommunications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCommunications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCommunications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCommunications")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeResolvedCases(value: IncludeResolvedCases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResolvedCases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeResolvedCases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResolvedCases")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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

