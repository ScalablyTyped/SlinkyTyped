package typingsSlinky.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for predictions to be issued against a trained model.
  */
@js.native
trait SchemaGoogleCloudMlV1PredictRequest extends js.Object {
  /**
    *  Required. The prediction request body.
    */
  var httpBody: js.UndefOr[SchemaGoogleApiHttpBody] = js.native
}

object SchemaGoogleCloudMlV1PredictRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1PredictRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1PredictRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1PredictRequestOps[Self <: SchemaGoogleCloudMlV1PredictRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpBody(value: SchemaGoogleApiHttpBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpBody")(js.undefined)
        ret
    }
  }
  
}

