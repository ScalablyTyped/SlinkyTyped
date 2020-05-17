package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionFilter extends js.Object {
  var direction: Enum = js.native
  var filter: Enum = js.native
  var labels: Type = js.native
  @JSName("org")
  var org_ : Required = js.native
  var page: Type = js.native
  var per_page: Type = js.native
  var since: Type = js.native
  var sort: Enum = js.native
  var state: Enum = js.native
}

object DirectionFilter {
  @scala.inline
  def apply(
    direction: Enum,
    filter: Enum,
    labels: Type,
    org_ : Required,
    page: Type,
    per_page: Type,
    since: Type,
    sort: Enum,
    state: Enum
  ): DirectionFilter = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionFilter]
  }
  @scala.inline
  implicit class DirectionFilterOps[Self <: DirectionFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSince(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

