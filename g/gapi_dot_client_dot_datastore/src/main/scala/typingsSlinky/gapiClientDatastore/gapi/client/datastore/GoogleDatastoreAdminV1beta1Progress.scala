package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleDatastoreAdminV1beta1Progress extends js.Object {
  /**
    * The amount of work that has been completed. Note that this may be greater
    * than work_estimated.
    */
  var workCompleted: js.UndefOr[String] = js.native
  /**
    * An estimate of how much work needs to be performed. May be zero if the
    * work estimate is unavailable.
    */
  var workEstimated: js.UndefOr[String] = js.native
}

object GoogleDatastoreAdminV1beta1Progress {
  @scala.inline
  def apply(): GoogleDatastoreAdminV1beta1Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1Progress]
  }
  @scala.inline
  implicit class GoogleDatastoreAdminV1beta1ProgressOps[Self <: GoogleDatastoreAdminV1beta1Progress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkCompleted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkEstimated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workEstimated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkEstimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workEstimated")(js.undefined)
        ret
    }
  }
  
}

