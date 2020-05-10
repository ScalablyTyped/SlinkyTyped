package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source specific facet response
  */
@js.native
trait SchemaFacetResult extends js.Object {
  /**
    * FacetBuckets for values in response containing at least a single result.
    */
  var buckets: js.UndefOr[js.Array[SchemaFacetBucket]] = js.native
  /**
    * Object type for which facet results are returned. Can be empty.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * Source name for which facet results are returned. Will not be empty.
    */
  var sourceName: js.UndefOr[String] = js.native
}

object SchemaFacetResult {
  @scala.inline
  def apply(): SchemaFacetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacetResult]
  }
  @scala.inline
  implicit class SchemaFacetResultOps[Self <: SchemaFacetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[SchemaFacetBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
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
    @scala.inline
    def withOperatorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatorName")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceName")(js.undefined)
        ret
    }
  }
  
}

