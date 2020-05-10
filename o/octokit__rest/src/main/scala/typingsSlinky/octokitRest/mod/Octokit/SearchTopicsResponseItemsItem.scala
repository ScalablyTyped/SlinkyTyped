package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTopicsResponseItemsItem extends js.Object {
  var created_at: String = js.native
  var created_by: String = js.native
  var curated: Boolean = js.native
  var description: String = js.native
  var display_name: String = js.native
  var featured: Boolean = js.native
  var name: String = js.native
  var released: String = js.native
  var score: Double = js.native
  var short_description: String = js.native
  var updated_at: String = js.native
}

object SearchTopicsResponseItemsItem {
  @scala.inline
  def apply(
    created_at: String,
    created_by: String,
    curated: Boolean,
    description: String,
    display_name: String,
    featured: Boolean,
    name: String,
    released: String,
    score: Double,
    short_description: String,
    updated_at: String
  ): SearchTopicsResponseItemsItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], curated = curated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], short_description = short_description.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTopicsResponseItemsItem]
  }
  @scala.inline
  implicit class SearchTopicsResponseItemsItemOps[Self <: SearchTopicsResponseItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleased(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("released")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

