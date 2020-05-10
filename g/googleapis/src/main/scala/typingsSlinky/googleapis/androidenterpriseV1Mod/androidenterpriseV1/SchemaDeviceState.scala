package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state of a user&#39;s device, as accessed by the getState and setState
  * methods on device resources.
  */
@js.native
trait SchemaDeviceState extends js.Object {
  /**
    * The state of the Google account on the device. &quot;enabled&quot;
    * indicates that the Google account on the device can be used to access
    * Google services (including Google Play), while &quot;disabled&quot; means
    * that it cannot. A new device is initially in the &quot;disabled&quot;
    * state.
    */
  var accountState: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#deviceState&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDeviceState {
  @scala.inline
  def apply(): SchemaDeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceState]
  }
  @scala.inline
  implicit class SchemaDeviceStateOps[Self <: SchemaDeviceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountState")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

