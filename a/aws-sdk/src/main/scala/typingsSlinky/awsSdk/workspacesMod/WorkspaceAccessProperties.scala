package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceAccessProperties extends js.Object {
  /**
    * Indicates whether users can use Android devices to access their WorkSpaces.
    */
  var DeviceTypeAndroid: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use Chromebooks to access their WorkSpaces.
    */
  var DeviceTypeChromeOs: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use iOS devices to access their WorkSpaces.
    */
  var DeviceTypeIos: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to trusted devices (also known as managed devices) with valid certificates, specify a value of TRUST. For more information, see Restrict WorkSpaces Access to Trusted Devices. 
    */
  var DeviceTypeOsx: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can access their WorkSpaces through a web browser.
    */
  var DeviceTypeWeb: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access to trusted devices (also known as managed devices) with valid certificates, specify a value of TRUST. For more information, see Restrict WorkSpaces Access to Trusted Devices. 
    */
  var DeviceTypeWindows: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use zero client devices to access their WorkSpaces.
    */
  var DeviceTypeZeroClient: js.UndefOr[AccessPropertyValue] = js.native
}

object WorkspaceAccessProperties {
  @scala.inline
  def apply(): WorkspaceAccessProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceAccessProperties]
  }
  @scala.inline
  implicit class WorkspaceAccessPropertiesOps[Self <: WorkspaceAccessProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceTypeAndroid(value: AccessPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTypeAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceTypeChromeOs(value: AccessPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeChromeOs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTypeChromeOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeChromeOs")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceTypeIos(value: AccessPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeIos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTypeIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeIos")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceTypeOsx(value: AccessPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeOsx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTypeOsx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeOsx")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceTypeWeb(value: AccessPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTypeWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeWeb")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceTypeWindows(value: AccessPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeWindows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTypeWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeWindows")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceTypeZeroClient(value: AccessPropertyValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeZeroClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTypeZeroClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceTypeZeroClient")(js.undefined)
        ret
    }
  }
  
}

