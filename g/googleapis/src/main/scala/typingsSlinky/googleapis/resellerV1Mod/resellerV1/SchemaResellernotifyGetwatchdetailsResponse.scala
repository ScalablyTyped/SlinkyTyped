package typingsSlinky.googleapis.resellerV1Mod.resellerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for resellernotify getwatchdetails response.
  */
@js.native
trait SchemaResellernotifyGetwatchdetailsResponse extends js.Object {
  /**
    * List of registered service accounts.
    */
  var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Topic name of the PubSub
    */
  var topicName: js.UndefOr[String] = js.native
}

object SchemaResellernotifyGetwatchdetailsResponse {
  @scala.inline
  def apply(): SchemaResellernotifyGetwatchdetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResellernotifyGetwatchdetailsResponse]
  }
  @scala.inline
  implicit class SchemaResellernotifyGetwatchdetailsResponseOps[Self <: SchemaResellernotifyGetwatchdetailsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceAccountEmailAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmailAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmailAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmailAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(js.undefined)
        ret
    }
  }
  
}

