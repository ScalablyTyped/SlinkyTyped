package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListProductSets` method.
  */
@js.native
trait SchemaListProductSetsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of ProductSets.
    */
  var productSets: js.UndefOr[js.Array[SchemaProductSet]] = js.native
}

object SchemaListProductSetsResponse {
  @scala.inline
  def apply(): SchemaListProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProductSetsResponse]
  }
  @scala.inline
  implicit class SchemaListProductSetsResponseOps[Self <: SchemaListProductSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProductSets(value: js.Array[SchemaProductSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSets")(js.undefined)
        ret
    }
  }
  
}

