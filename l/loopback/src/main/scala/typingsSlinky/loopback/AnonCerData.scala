package typingsSlinky.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCerData extends js.Object {
  var cerData: String = js.native
  var feedBackOptions: AnonBatchFeedback = js.native
  var keyData: String = js.native
  var production: Boolean = js.native
  var pushOptions: AnonGateway = js.native
}

object AnonCerData {
  @scala.inline
  def apply(
    cerData: String,
    feedBackOptions: AnonBatchFeedback,
    keyData: String,
    production: Boolean,
    pushOptions: AnonGateway
  ): AnonCerData = {
    val __obj = js.Dynamic.literal(cerData = cerData.asInstanceOf[js.Any], feedBackOptions = feedBackOptions.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any], production = production.asInstanceOf[js.Any], pushOptions = pushOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCerData]
  }
  @scala.inline
  implicit class AnonCerDataOps[Self <: AnonCerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCerData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedBackOptions(value: AnonBatchFeedback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedBackOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushOptions(value: AnonGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

