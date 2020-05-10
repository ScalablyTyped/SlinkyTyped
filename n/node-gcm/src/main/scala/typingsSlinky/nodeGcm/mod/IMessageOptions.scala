package typingsSlinky.nodeGcm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageOptions extends js.Object {
  var collapseKey: js.UndefOr[String] = js.native
  var contentAvailable: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[StringDictionary[String]] = js.native
  var delayWhileIdle: js.UndefOr[Boolean] = js.native
  var dryRun: js.UndefOr[Boolean] = js.native
  var mutableContent: js.UndefOr[Boolean] = js.native
  var notification: js.UndefOr[INotificationOptions] = js.native
  var priority: js.UndefOr[String] = js.native
  var restrictedPackageName: js.UndefOr[String] = js.native
  var timeToLive: js.UndefOr[Double] = js.native
}

object IMessageOptions {
  @scala.inline
  def apply(): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageOptions]
  }
  @scala.inline
  implicit class IMessageOptionsOps[Self <: IMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withContentAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayWhileIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayWhileIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayWhileIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayWhileIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withMutableContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutableContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableContent")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: INotificationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictedPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedPackageName")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToLive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToLive")(js.undefined)
        ret
    }
  }
  
}

