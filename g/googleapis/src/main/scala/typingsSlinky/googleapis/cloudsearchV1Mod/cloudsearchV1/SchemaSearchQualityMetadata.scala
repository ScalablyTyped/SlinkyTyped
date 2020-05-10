package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional search quality metadata of the item.
  */
@js.native
trait SchemaSearchQualityMetadata extends js.Object {
  /**
    * An indication of the quality of the item, used to influence search
    * quality. Value should be between 0.0 (lowest quality) and 1.0 (highest
    * quality). The default value is 0.0.
    */
  var quality: js.UndefOr[Double] = js.native
}

object SchemaSearchQualityMetadata {
  @scala.inline
  def apply(): SchemaSearchQualityMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchQualityMetadata]
  }
  @scala.inline
  implicit class SchemaSearchQualityMetadataOps[Self <: SchemaSearchQualityMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
  }
  
}

