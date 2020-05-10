package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `ImportProductSets` method.
  */
@js.native
trait SchemaImportProductSetsRequest extends js.Object {
  /**
    * The input content for the list of requests.
    */
  var inputConfig: js.UndefOr[SchemaImportProductSetsInputConfig] = js.native
}

object SchemaImportProductSetsRequest {
  @scala.inline
  def apply(): SchemaImportProductSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportProductSetsRequest]
  }
  @scala.inline
  implicit class SchemaImportProductSetsRequestOps[Self <: SchemaImportProductSetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputConfig(value: SchemaImportProductSetsInputConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputConfig")(js.undefined)
        ret
    }
  }
  
}

