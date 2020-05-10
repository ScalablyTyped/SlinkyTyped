package typingsSlinky.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.packageJson.AnonIntegrity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbbreviatedVersion
  extends /* key */ StringDictionary[js.Any] {
  val _hasShrinkwrap: js.UndefOr[Boolean] = js.native
  val bin: js.UndefOr[StringDictionary[String]] = js.native
  val bundleDependencies: js.UndefOr[StringDictionary[String]] = js.native
  val dependencies: js.UndefOr[StringDictionary[String]] = js.native
  val deprecated: js.UndefOr[String] = js.native
  val devDependencies: js.UndefOr[StringDictionary[String]] = js.native
  val directories: js.UndefOr[js.Array[String]] = js.native
  val dist: AnonIntegrity = js.native
  val engines: js.UndefOr[StringDictionary[String]] = js.native
  val name: String = js.native
  val optionalDependencies: js.UndefOr[StringDictionary[String]] = js.native
  val peerDependencies: js.UndefOr[StringDictionary[String]] = js.native
  val version: String = js.native
}

object AbbreviatedVersion {
  @scala.inline
  def apply(dist: AnonIntegrity, name: String, version: String): AbbreviatedVersion = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbbreviatedVersion]
  }
  @scala.inline
  implicit class AbbreviatedVersionOps[Self <: AbbreviatedVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDist(value: AnonIntegrity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_hasShrinkwrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hasShrinkwrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_hasShrinkwrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hasShrinkwrap")(js.undefined)
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
    def withDeprecated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
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
    def withDirectories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(js.undefined)
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
    def withPeerDependencies(value: StringDictionary[String]): Self = {
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
  }
  
}

