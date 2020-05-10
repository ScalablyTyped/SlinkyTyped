package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeAndroidChannel extends js.Object {
  var bypassDnd: js.UndefOr[Boolean] = js.native
  var channelId: String = js.native
  var description: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
  var importance: Double = js.native
  var lightColor: js.UndefOr[String] = js.native
  var lightsEnabled: js.UndefOr[Boolean] = js.native
  var lockScreenVisibility: js.UndefOr[Double] = js.native
  var name: String = js.native
  var showBadge: js.UndefOr[Boolean] = js.native
  var sound: js.UndefOr[String] = js.native
  var vibrationEnabled: js.UndefOr[Boolean] = js.native
  var vibrationPattern: js.UndefOr[js.Array[Double]] = js.native
}

object NativeAndroidChannel {
  @scala.inline
  def apply(channelId: String, importance: Double, name: String): NativeAndroidChannel = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeAndroidChannel]
  }
  @scala.inline
  implicit class NativeAndroidChannelOps[Self <: NativeAndroidChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBypassDnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassDnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassDnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassDnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withLightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLightsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScreenVisibility(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScreenVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScreenVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBadge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBadge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBadge")(js.undefined)
        ret
    }
    @scala.inline
    def withSound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(js.undefined)
        ret
    }
    @scala.inline
    def withVibrationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVibrationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVibrationPattern(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrationPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVibrationPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vibrationPattern")(js.undefined)
        ret
    }
  }
  
}

