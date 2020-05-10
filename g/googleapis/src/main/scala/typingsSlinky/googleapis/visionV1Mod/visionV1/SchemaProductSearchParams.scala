package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for a product search request.
  */
@js.native
trait SchemaProductSearchParams extends js.Object {
  /**
    * The bounding polygon around the area of interest in the image. Optional.
    * If it is not specified, system discretion will be applied.
    */
  var boundingPoly: js.UndefOr[SchemaBoundingPoly] = js.native
  /**
    * The filtering expression. This can be used to restrict search results
    * based on Product labels. We currently support an AND of OR of key-value
    * expressions, where each expression within an OR must have the same key.
    * For example, &quot;(color = red OR color = blue) AND brand = Google&quot;
    * is acceptable, but not &quot;(color = red OR brand = Google)&quot; or
    * &quot;color: red&quot;.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The list of product categories to search in. Currently, we only consider
    * the first category, and either &quot;homegoods&quot;,
    * &quot;apparel&quot;, or &quot;toys&quot; should be specified.
    */
  var productCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * The resource name of a ProductSet to be searched for similar images.
    * Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
    */
  var productSet: js.UndefOr[String] = js.native
}

object SchemaProductSearchParams {
  @scala.inline
  def apply(): SchemaProductSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSearchParams]
  }
  @scala.inline
  implicit class SchemaProductSearchParamsOps[Self <: SchemaProductSearchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingPoly(value: SchemaBoundingPoly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingPoly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
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
    def withProductCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withProductSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSet")(js.undefined)
        ret
    }
  }
  
}

