package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.pubnubStrings.development
import typingsSlinky.pubnub.pubnubStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APNS2Target extends js.Object {
  var environment: js.UndefOr[development | production] = js.native
  var excludedDevices: js.UndefOr[js.Array[String]] = js.native
  var topic: String = js.native
}

object APNS2Target {
  @scala.inline
  def apply(topic: String): APNS2Target = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNS2Target]
  }
  @scala.inline
  implicit class APNS2TargetOps[Self <: APNS2Target] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: development | production): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedDevices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedDevices")(js.undefined)
        ret
    }
  }
  
}

