package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenRealmBehaviorConfiguration extends js.Object {
  val timeOut: js.UndefOr[Double] = js.native
  val timeOutBehavior: js.UndefOr[OpenRealmTimeOutBehavior] = js.native
  val `type`: OpenRealmBehaviorType = js.native
}

object OpenRealmBehaviorConfiguration {
  @scala.inline
  def apply(`type`: OpenRealmBehaviorType): OpenRealmBehaviorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenRealmBehaviorConfiguration]
  }
  @scala.inline
  implicit class OpenRealmBehaviorConfigurationOps[Self <: OpenRealmBehaviorConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: OpenRealmBehaviorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOutBehavior(value: OpenRealmTimeOutBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOutBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOutBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOutBehavior")(js.undefined)
        ret
    }
  }
  
}

