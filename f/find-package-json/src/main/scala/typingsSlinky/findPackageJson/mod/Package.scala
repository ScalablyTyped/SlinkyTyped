package typingsSlinky.findPackageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.findPackageJson.anon.Email
import typingsSlinky.findPackageJson.anon.Type
import typingsSlinky.findPackageJson.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Package
  extends /* k */ StringDictionary[js.Any] {
  var author: js.UndefOr[Person] = js.native
  var bin: js.UndefOr[StringDictionary[String]] = js.native
  var bugs: js.UndefOr[Email | Url] = js.native
  var bundleDependencies: js.UndefOr[StringDictionary[String]] = js.native
  var contributors: js.UndefOr[js.Array[Person]] = js.native
  var dependencies: js.UndefOr[StringDictionary[String]] = js.native
  var description: js.UndefOr[String] = js.native
  var devDependencies: js.UndefOr[StringDictionary[String]] = js.native
  var engines: js.UndefOr[StringDictionary[String]] = js.native
  var files: js.UndefOr[js.Array[String]] = js.native
  var homepage: js.UndefOr[String] = js.native
  var keywords: js.UndefOr[js.Array[String]] = js.native
  var license: js.UndefOr[String] = js.native
  var maintainers: js.UndefOr[js.Array[Person]] = js.native
  var man: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var optionalDependencies: js.UndefOr[StringDictionary[String]] = js.native
  var readme: js.UndefOr[String] = js.native
  var repository: js.UndefOr[Type] = js.native
  var scripts: js.UndefOr[StringDictionary[String]] = js.native
  var version: js.UndefOr[String] = js.native
}

object Package {
  @scala.inline
  def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
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
    def withBin(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin")(js.undefined)
        ret
    }
    @scala.inline
    def withBugs(value: Email | Url): Self = {
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
    def withBundleDependencies(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleDependencies")(js.undefined)
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
    def withDependencies(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
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
    def withDevDependencies(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withEngines(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engines")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
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
    def withMan(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("man")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("man")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalDependencies(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalDependencies")(js.undefined)
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
    def withRepository(value: Type): Self = {
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
    @scala.inline
    def withScripts(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

