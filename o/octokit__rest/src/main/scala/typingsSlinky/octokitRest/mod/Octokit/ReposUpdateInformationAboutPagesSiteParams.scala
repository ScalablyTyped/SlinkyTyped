package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.QuotationmarkmasterQuotationmark
import typingsSlinky.octokitRest.octokitRestStrings.`Quotationmarkgh-pagesQuotationmark`
import typingsSlinky.octokitRest.octokitRestStrings.`Quotationmarkmaster SlashdocsQuotationmark`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateInformationAboutPagesSiteParams extends js.Object {
  /**
    * Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://help.github.com/articles/using-a-custom-domain-with-github-pages/)."
    */
  var cname: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
  /**
    * Update the source for the repository. Must include the branch name, and may optionally specify the subdirectory `/docs`. Possible values are `"gh-pages"`, `"master"`, and `"master /docs"`.
    */
  var source: js.UndefOr[
    `Quotationmarkgh-pagesQuotationmark` | QuotationmarkmasterQuotationmark | (`Quotationmarkmaster SlashdocsQuotationmark`)
  ] = js.native
}

object ReposUpdateInformationAboutPagesSiteParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposUpdateInformationAboutPagesSiteParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteParams]
  }
  @scala.inline
  implicit class ReposUpdateInformationAboutPagesSiteParamsOps[Self <: ReposUpdateInformationAboutPagesSiteParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cname")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(
      value: `Quotationmarkgh-pagesQuotationmark` | QuotationmarkmasterQuotationmark | (`Quotationmarkmaster SlashdocsQuotationmark`)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

