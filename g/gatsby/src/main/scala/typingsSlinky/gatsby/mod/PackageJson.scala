package typingsSlinky.gatsby.mod

import typingsSlinky.gatsby.AnonEmail
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageJson extends js.Object {
  var author: js.UndefOr[String | AnonEmail] = js.native
  var bundledDependencies: js.UndefOr[js.Array[String]] = js.native
  var dependencies: js.UndefOr[Record[String, String]] = js.native
  var description: js.UndefOr[String] = js.native
  var devDependencies: js.UndefOr[Record[String, String]] = js.native
  var keywords: js.UndefOr[js.Array[String]] = js.native
  var license: js.UndefOr[String] = js.native
  var main: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var optionalDependencies: js.UndefOr[Record[String, String]] = js.native
  var peerDependencies: js.UndefOr[Record[String, String]] = js.native
  var version: js.UndefOr[String] = js.native
}

object PackageJson {
  @scala.inline
  def apply(): PackageJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageJson]
  }
  @scala.inline
  implicit class PackageJsonOps[Self <: PackageJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: String | AnonEmail): Self = {
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
    def withBundledDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundledDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundledDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundledDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencies(value: Record[String, String]): Self = {
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
    def withDevDependencies(value: Record[String, String]): Self = {
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
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(js.undefined)
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
    def withOptionalDependencies(value: Record[String, String]): Self = {
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
    def withPeerDependencies(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerDependencies")(js.undefined)
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

