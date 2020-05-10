package typingsSlinky.packageJson.mod

import typingsSlinky.packageJson.AnonEmail
import typingsSlinky.packageJson.AnonType
import typingsSlinky.packageJson.AnonUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoistedData extends js.Object {
  val author: js.UndefOr[Person] = js.native
  val bugs: js.UndefOr[AnonEmail | AnonUrl] = js.native
  val contributors: js.UndefOr[js.Array[Person]] = js.native
  val description: js.UndefOr[String] = js.native
  val homepage: js.UndefOr[String] = js.native
  val keywords: js.UndefOr[js.Array[String]] = js.native
  val license: js.UndefOr[String] = js.native
  val maintainers: js.UndefOr[js.Array[Person]] = js.native
  val readme: js.UndefOr[String] = js.native
  val readmeFilename: js.UndefOr[String] = js.native
  val repository: js.UndefOr[AnonType] = js.native
}

object HoistedData {
  @scala.inline
  def apply(): HoistedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoistedData]
  }
  @scala.inline
  implicit class HoistedDataOps[Self <: HoistedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: Person): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withBugs(value: AnonEmail | AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBugs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bugs")(js.undefined)
        ret
    }
    @scala.inline
    def withContributors(value: js.Array[Person]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributors")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHomepage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomepage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainers(value: js.Array[Person]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainers")(js.undefined)
        ret
    }
    @scala.inline
    def withReadme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readme")(js.undefined)
        ret
    }
    @scala.inline
    def withReadmeFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readmeFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadmeFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readmeFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withRepository(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(js.undefined)
        ret
    }
  }
  
}

