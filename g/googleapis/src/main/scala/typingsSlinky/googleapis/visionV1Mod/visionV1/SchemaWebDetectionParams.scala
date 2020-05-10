package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for web detection request.
  */
@js.native
trait SchemaWebDetectionParams extends js.Object {
  /**
    * Whether to include results derived from the geo information in the image.
    */
  var includeGeoResults: js.UndefOr[Boolean] = js.native
}

object SchemaWebDetectionParams {
  @scala.inline
  def apply(): SchemaWebDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebDetectionParams]
  }
  @scala.inline
  implicit class SchemaWebDetectionParamsOps[Self <: SchemaWebDetectionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeGeoResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGeoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGeoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGeoResults")(js.undefined)
        ret
    }
  }
  
}

