package typingsSlinky.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.packageJson.anon.Dictversion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullMetadata
  extends AbbreviatedMetadata
     with HoistedData {
  val _id: String = js.native
  val _rev: String = js.native
  val time: Dictversion = js.native
  val users: js.UndefOr[StringDictionary[Boolean]] = js.native
  @JSName("versions")
  val versions_FullMetadata: StringDictionary[FullVersion] = js.native
}

object FullMetadata {
  @scala.inline
  def apply(
    _id: String,
    _rev: String,
    `dist-tags`: DistTags,
    modified: String,
    name: String,
    time: Dictversion,
    versions: StringDictionary[FullVersion]
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadata]
  }
  @scala.inline
  implicit class FullMetadataOps[Self <: FullMetadata] (val x: Self) extends AnyVal {
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
    def with_rev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Dictversion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: StringDictionary[FullVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}

