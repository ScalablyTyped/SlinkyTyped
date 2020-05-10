package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectedApp extends Entity {
  // The number of devices that have installed this application
  var deviceCount: js.UndefOr[Double] = js.native
  // Name of the discovered application. Read-only
  var displayName: js.UndefOr[String] = js.native
  // The devices that have the discovered application installed
  var managedDevices: js.UndefOr[js.Array[ManagedDevice]] = js.native
  // Discovered application size in bytes. Read-only
  var sizeInByte: js.UndefOr[Double] = js.native
  // Version of the discovered application. Read-only
  var version: js.UndefOr[String] = js.native
}

object DetectedApp {
  @scala.inline
  def apply(): DetectedApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedApp]
  }
  @scala.inline
  implicit class DetectedAppOps[Self <: DetectedApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedDevices(value: js.Array[ManagedDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeInByte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInByte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInByte")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

