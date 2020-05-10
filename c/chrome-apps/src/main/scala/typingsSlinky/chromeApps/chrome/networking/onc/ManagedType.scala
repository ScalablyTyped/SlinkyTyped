package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedType[T] extends js.Object {
  /** The active value currently used by the network configuration manager (e.g. Shill). */
  var Active: js.UndefOr[T] = js.native
  /**
    * Whether a DevicePolicy for the property exists and allows the property
    * to be edited (i.e. the policy set recommended property value).
    * @default false
    */
  var DeviceEditable: js.UndefOr[Boolean] = js.native
  /** The property value provided by the device policy. */
  var DevicePolicy: js.UndefOr[T] = js.native
  /** The source from which the effective property value was determined. */
  var Effective: js.UndefOr[String] = js.native
  /** The value set for all users of the device. Only provided if *DeviceEditiable* is true. */
  var SharedSetting: js.UndefOr[T] = js.native
  /**
    * Whether a UserPolicy for the property exists and allows the property
    * to be edited (i.e. the policy set recommended property value).
    * @default false
    */
  var UserEditable: js.UndefOr[Boolean] = js.native
  /** The property value provided by the user policy. */
  var UserPolicy: js.UndefOr[T] = js.native
  /** The property value set by the logged in user. Only provided if *UserEditable* is true. */
  var UserSetting: js.UndefOr[T] = js.native
}

object ManagedType {
  @scala.inline
  def apply[T](): ManagedType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedType[T]]
  }
  @scala.inline
  implicit class ManagedTypeOps[Self[t] <: ManagedType[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withActive(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceEditable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceEditable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withDevicePolicy(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevicePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePolicy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevicePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withEffective(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Effective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffective: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Effective")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedSetting(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedSetting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEditable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEditable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPolicy(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPolicy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withUserSetting(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserSetting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSetting")(js.undefined)
        ret
    }
  }
  
}

