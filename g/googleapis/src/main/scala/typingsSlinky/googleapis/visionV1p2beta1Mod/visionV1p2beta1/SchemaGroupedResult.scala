package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the products similar to a single product in a query
  * image.
  */
@js.native
trait SchemaGroupedResult extends js.Object {
  /**
    * The bounding polygon around the product detected in the query image.
    */
  var boundingPoly: js.UndefOr[SchemaBoundingPoly] = js.native
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaResult]] = js.native
}

object SchemaGroupedResult {
  @scala.inline
  def apply(): SchemaGroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupedResult]
  }
  @scala.inline
  implicit class SchemaGroupedResultOps[Self <: SchemaGroupedResult] (val x: Self) extends AnyVal {
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
    def withResults(value: js.Array[SchemaResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

