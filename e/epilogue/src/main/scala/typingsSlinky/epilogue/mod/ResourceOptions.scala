package typingsSlinky.epilogue.mod

import typingsSlinky.epilogue.AnonModel
import typingsSlinky.sequelize.mod.AssociationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceOptions extends js.Object {
  var actions: js.UndefOr[js.Array[String]] = js.native
  var associations: js.UndefOr[AssociationOptions] = js.native
  var endpoints: js.Array[String] = js.native
  var excludeAttributes: js.UndefOr[js.Array[String]] = js.native
  var include: js.UndefOr[js.Array[AnonModel | String]] = js.native
  var model: js.Any = js.native
  var pagination: js.UndefOr[Boolean] = js.native
  var readOnlyAttributes: js.UndefOr[js.Array[String]] = js.native
  var reloadInstances: js.UndefOr[Boolean] = js.native
  var search: js.UndefOr[ResourceSearchOption] = js.native
  var sort: js.UndefOr[ResourceSortOption] = js.native
  var updateMethod: js.UndefOr[String] = js.native
}

object ResourceOptions {
  @scala.inline
  def apply(endpoints: js.Array[String], model: js.Any): ResourceOptions = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOptions]
  }
  @scala.inline
  implicit class ResourceOptionsOps[Self <: ResourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociations(value: AssociationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[AnonModel | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnlyAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnlyAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withReloadInstances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReloadInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloadInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: ResourceSearchOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: ResourceSortOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMethod")(js.undefined)
        ret
    }
  }
  
}

