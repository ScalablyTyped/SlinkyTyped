package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementsGenerateTagsResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var placementTags: js.UndefOr[js.Array[PlacementTag]] = js.native
}

object PlacementsGenerateTagsResponse {
  @scala.inline
  def apply(): PlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementsGenerateTagsResponse]
  }
  @scala.inline
  implicit class PlacementsGenerateTagsResponseOps[Self <: PlacementsGenerateTagsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementTags(value: js.Array[PlacementTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementTags")(js.undefined)
        ret
    }
  }
  
}

