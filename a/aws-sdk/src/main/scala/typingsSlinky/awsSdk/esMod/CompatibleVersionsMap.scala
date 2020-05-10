package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleVersionsMap extends js.Object {
  /**
    * The current version of Elasticsearch on which a domain is.
    */
  var SourceVersion: js.UndefOr[ElasticsearchVersionString] = js.native
  var TargetVersions: js.UndefOr[ElasticsearchVersionList] = js.native
}

object CompatibleVersionsMap {
  @scala.inline
  def apply(): CompatibleVersionsMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleVersionsMap]
  }
  @scala.inline
  implicit class CompatibleVersionsMapOps[Self <: CompatibleVersionsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceVersion(value: ElasticsearchVersionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetVersions(value: ElasticsearchVersionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetVersions")(js.undefined)
        ret
    }
  }
  
}

