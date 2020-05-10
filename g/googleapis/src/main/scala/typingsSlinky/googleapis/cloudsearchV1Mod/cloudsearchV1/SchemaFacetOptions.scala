package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies operators to return facet results for. There will be one
  * FacetResult for every source_name/object_type/operator_name combination.
  */
@js.native
trait SchemaFacetOptions extends js.Object {
  /**
    * Maximum number of facet buckets that should be returned for this facet.
    * Defaults to 10. Maximum value is 100.
    */
  var numFacetBuckets: js.UndefOr[Double] = js.native
  /**
    * If object_type is set, only those objects of that type will be used to
    * compute facets. If empty, then all objects will be used to compute
    * facets.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions
    */
  var operatorName: js.UndefOr[String] = js.native
  /**
    * Source name to facet on. Format: datasources/{source_id} If empty, all
    * data sources will be used.
    */
  var sourceName: js.UndefOr[String] = js.native
}

object SchemaFacetOptions {
  @scala.inline
  def apply(): SchemaFacetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacetOptions]
  }
  @scala.inline
  implicit class SchemaFacetOptionsOps[Self <: SchemaFacetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumFacetBuckets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFacetBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFacetBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFacetBuckets")(js.undefined)
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

