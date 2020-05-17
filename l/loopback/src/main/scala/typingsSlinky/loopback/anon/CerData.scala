package typingsSlinky.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CerData extends js.Object {
  var cerData: String = js.native
  var feedBackOptions: BatchFeedback = js.native
  var keyData: String = js.native
  var production: Boolean = js.native
  var pushOptions: Gateway = js.native
}

object CerData {
  @scala.inline
  def apply(
    cerData: String,
    feedBackOptions: BatchFeedback,
    keyData: String,
    production: Boolean,
    pushOptions: Gateway
  ): CerData = {
    val __obj = js.Dynamic.literal(cerData = cerData.asInstanceOf[js.Any], feedBackOptions = feedBackOptions.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any], production = production.asInstanceOf[js.Any], pushOptions = pushOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CerData]
  }
  @scala.inline
  implicit class CerDataOps[Self <: CerData] (val x: Self) extends AnyVal {
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
    def withFeedBackOptions(value: BatchFeedback): Self = {
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
    def withPushOptions(value: Gateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

