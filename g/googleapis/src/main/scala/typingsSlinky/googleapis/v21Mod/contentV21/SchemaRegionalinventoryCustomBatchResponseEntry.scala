package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch regional inventory response.
  */
@js.native
trait SchemaRegionalinventoryCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#regionalinventoryCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Price and availability of the product.
    */
  var regionalInventory: js.UndefOr[SchemaRegionalInventory] = js.native
}

object SchemaRegionalinventoryCustomBatchResponseEntry {
  @scala.inline
  def apply(): SchemaRegionalinventoryCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalinventoryCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class SchemaRegionalinventoryCustomBatchResponseEntryOps[Self <: SchemaRegionalinventoryCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: SchemaErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionalInventory(value: SchemaRegionalInventory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalInventory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionalInventory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionalInventory")(js.undefined)
        ret
    }
  }
  
}

