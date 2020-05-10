package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ProductSet contains Products. A ProductSet can contain a maximum of 1
  * million reference images. If the limit is exceeded, periodic indexing will
  * fail.
  */
@js.native
trait SchemaProductSet extends js.Object {
  /**
    * The user-provided name for this ProductSet. Must not be empty. Must be at
    * most 4096 characters long.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Output only. If there was an error with indexing the product set, the
    * field is populated.  This field is ignored when creating a ProductSet.
    */
  var indexError: js.UndefOr[SchemaStatus] = js.native
  /**
    * Output only. The time at which this ProductSet was last indexed. Query
    * results will reflect all updates before this time. If this ProductSet has
    * never been indexed, this timestamp is the default value
    * &quot;1970-01-01T00:00:00Z&quot;.  This field is ignored when creating a
    * ProductSet.
    */
  var indexTime: js.UndefOr[String] = js.native
  /**
    * The resource name of the ProductSet.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.  This
    * field is ignored when creating a ProductSet.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaProductSet {
  @scala.inline
  def apply(): SchemaProductSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSet]
  }
  @scala.inline
  implicit class SchemaProductSetOps[Self <: SchemaProductSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexError(value: SchemaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexError")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

