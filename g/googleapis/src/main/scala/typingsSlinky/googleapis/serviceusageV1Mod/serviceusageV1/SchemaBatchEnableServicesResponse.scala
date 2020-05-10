package typingsSlinky.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `BatchEnableServices` method. This response
  * message is assigned to the `response` field of the returned Operation when
  * that operation is done.
  */
@js.native
trait SchemaBatchEnableServicesResponse extends js.Object {
  /**
    * If allow_partial_success is true, and one or more services could not be
    * enabled, this field contains the details about each failure.
    */
  var failures: js.UndefOr[js.Array[SchemaEnableFailure]] = js.native
  /**
    * The new state of the services after enabling.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleApiServiceusageV1Service]] = js.native
}

object SchemaBatchEnableServicesResponse {
  @scala.inline
  def apply(): SchemaBatchEnableServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchEnableServicesResponse]
  }
  @scala.inline
  implicit class SchemaBatchEnableServicesResponseOps[Self <: SchemaBatchEnableServicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailures(value: js.Array[SchemaEnableFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: js.Array[SchemaGoogleApiServiceusageV1Service]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
  }
  
}

