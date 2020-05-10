package typingsSlinky.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbbreviatedMetadata
  extends /* key */ StringDictionary[js.Any] {
  val `dist-tags`: DistTags = js.native
  val modified: String = js.native
  val name: String = js.native
  val versions: StringDictionary[AbbreviatedVersion] = js.native
}

object AbbreviatedMetadata {
  @scala.inline
  def apply(
    `dist-tags`: DistTags,
    modified: String,
    name: String,
    versions: StringDictionary[AbbreviatedVersion]
  ): AbbreviatedMetadata = {
    val __obj = js.Dynamic.literal(modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("dist-tags")(`dist-tags`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbbreviatedMetadata]
  }
  @scala.inline
  implicit class AbbreviatedMetadataOps[Self <: AbbreviatedMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withDist-tags`(value: DistTags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dist-tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: StringDictionary[AbbreviatedVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

