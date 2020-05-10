package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter options to be applied on query.
  */
@js.native
trait SchemaFilterOptions extends js.Object {
  /**
    * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
    */
  var filter: js.UndefOr[SchemaFilter] = js.native
  /**
    * If object_type is set, only objects of that type are returned. This
    * should correspond to the name of the object that was registered within
    * the definition of schema. The maximum length is 256 characters.
    */
  var objectType: js.UndefOr[String] = js.native
}

object SchemaFilterOptions {
  @scala.inline
  def apply(): SchemaFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterOptions]
  }
  @scala.inline
  implicit class SchemaFilterOptionsOps[Self <: SchemaFilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: SchemaFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
  }
  
}

