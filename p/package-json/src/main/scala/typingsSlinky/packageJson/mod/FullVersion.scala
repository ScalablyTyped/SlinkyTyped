package typingsSlinky.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.packageJson.AnonIntegrity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullVersion
  extends AbbreviatedVersion
     with HoistedData {
  val _id: String = js.native
  val _nodeVersion: String = js.native
  val _npmUser: String = js.native
  val _npmVersion: String = js.native
  val files: js.UndefOr[js.Array[String]] = js.native
  val gitHead: js.UndefOr[String] = js.native
  val main: js.UndefOr[String] = js.native
  val man: js.UndefOr[js.Array[String]] = js.native
  val scripts: js.UndefOr[StringDictionary[String]] = js.native
  val types: js.UndefOr[String] = js.native
  val typings: js.UndefOr[String] = js.native
}

object FullVersion {
  @scala.inline
  def apply(
    _id: String,
    _nodeVersion: String,
    _npmUser: String,
    _npmVersion: String,
    dist: AnonIntegrity,
    name: String,
    version: String
  ): FullVersion = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _nodeVersion = _nodeVersion.asInstanceOf[js.Any], _npmUser = _npmUser.asInstanceOf[js.Any], _npmVersion = _npmVersion.asInstanceOf[js.Any], dist = dist.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullVersion]
  }
  @scala.inline
  implicit class FullVersionOps[Self <: FullVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_nodeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_nodeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_npmUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_npmUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_npmVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_npmVersion")(value.asInstanceOf[js.Any])
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
    def withGitHead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHead")(js.undefined)
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
    def withTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withTypings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typings")(js.undefined)
        ret
    }
  }
  
}

