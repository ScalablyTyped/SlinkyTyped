package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosDeviceType extends js.Object {
  // Whether the app should run on iPads.
  var iPad: js.UndefOr[Boolean] = js.native
  // Whether the app should run on iPhones and iPods.
  var iPhoneAndIPod: js.UndefOr[Boolean] = js.native
}

object IosDeviceType {
  @scala.inline
  def apply(): IosDeviceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceType]
  }
  @scala.inline
  implicit class IosDeviceTypeOps[Self <: IosDeviceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPad")(js.undefined)
        ret
    }
    @scala.inline
    def withIPhoneAndIPod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPhoneAndIPod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPhoneAndIPod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPhoneAndIPod")(js.undefined)
        ret
    }
  }
  
}

