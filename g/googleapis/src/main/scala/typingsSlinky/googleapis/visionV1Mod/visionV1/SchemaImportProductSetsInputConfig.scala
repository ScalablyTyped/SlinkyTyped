package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The input content for the `ImportProductSets` method.
  */
@js.native
trait SchemaImportProductSetsInputConfig extends js.Object {
  /**
    * The Google Cloud Storage location for a csv file which preserves a list
    * of ImportProductSetRequests in each line.
    */
  var gcsSource: js.UndefOr[SchemaImportProductSetsGcsSource] = js.native
}

object SchemaImportProductSetsInputConfig {
  @scala.inline
  def apply(): SchemaImportProductSetsInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportProductSetsInputConfig]
  }
  @scala.inline
  implicit class SchemaImportProductSetsInputConfigOps[Self <: SchemaImportProductSetsInputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGcsSource(value: SchemaImportProductSetsGcsSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsSource")(js.undefined)
        ret
    }
  }
  
}

