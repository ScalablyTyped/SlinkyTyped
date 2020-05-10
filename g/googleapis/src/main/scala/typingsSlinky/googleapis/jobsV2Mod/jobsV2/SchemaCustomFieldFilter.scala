package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Custom field filter of the search.
  */
@js.native
trait SchemaCustomFieldFilter extends js.Object {
  /**
    * Required.  The query strings for the filter.
    */
  var queries: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.  The type of filter. Defaults to FilterType.OR.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCustomFieldFilter {
  @scala.inline
  def apply(): SchemaCustomFieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomFieldFilter]
  }
  @scala.inline
  implicit class SchemaCustomFieldFilterOps[Self <: SchemaCustomFieldFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

