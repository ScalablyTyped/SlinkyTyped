package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposRetrieveCommunityProfileMetricsResponseFiles extends js.Object {
  var code_of_conduct: ReposRetrieveCommunityProfileMetricsResponseFilesCodeOfConduct = js.native
  var contributing: ReposRetrieveCommunityProfileMetricsResponseFilesContributing = js.native
  var issue_template: ReposRetrieveCommunityProfileMetricsResponseFilesIssueTemplate = js.native
  var license: ReposRetrieveCommunityProfileMetricsResponseFilesLicense = js.native
  var pull_request_template: ReposRetrieveCommunityProfileMetricsResponseFilesPullRequestTemplate = js.native
  var readme: ReposRetrieveCommunityProfileMetricsResponseFilesReadme = js.native
}

object ReposRetrieveCommunityProfileMetricsResponseFiles {
  @scala.inline
  def apply(
    code_of_conduct: ReposRetrieveCommunityProfileMetricsResponseFilesCodeOfConduct,
    contributing: ReposRetrieveCommunityProfileMetricsResponseFilesContributing,
    issue_template: ReposRetrieveCommunityProfileMetricsResponseFilesIssueTemplate,
    license: ReposRetrieveCommunityProfileMetricsResponseFilesLicense,
    pull_request_template: ReposRetrieveCommunityProfileMetricsResponseFilesPullRequestTemplate,
    readme: ReposRetrieveCommunityProfileMetricsResponseFilesReadme
  ): ReposRetrieveCommunityProfileMetricsResponseFiles = {
    val __obj = js.Dynamic.literal(code_of_conduct = code_of_conduct.asInstanceOf[js.Any], contributing = contributing.asInstanceOf[js.Any], issue_template = issue_template.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], pull_request_template = pull_request_template.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsResponseFiles]
  }
  @scala.inline
  implicit class ReposRetrieveCommunityProfileMetricsResponseFilesOps[Self <: ReposRetrieveCommunityProfileMetricsResponseFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode_of_conduct(value: ReposRetrieveCommunityProfileMetricsResponseFilesCodeOfConduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_of_conduct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributing(value: ReposRetrieveCommunityProfileMetricsResponseFilesContributing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssue_template(value: ReposRetrieveCommunityProfileMetricsResponseFilesIssueTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issue_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicense(value: ReposRetrieveCommunityProfileMetricsResponseFilesLicense): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request_template(value: ReposRetrieveCommunityProfileMetricsResponseFilesPullRequestTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadme(value: ReposRetrieveCommunityProfileMetricsResponseFilesReadme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readme")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

