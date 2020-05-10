package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentMatrix extends js.Object {
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[AndroidDeviceList] = js.native
  /** A matrix of Android devices. */
  var androidMatrix: js.UndefOr[AndroidMatrix] = js.native
}

object EnvironmentMatrix {
  @scala.inline
  def apply(): EnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentMatrix]
  }
  @scala.inline
  implicit class EnvironmentMatrixOps[Self <: EnvironmentMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidDeviceList(value: AndroidDeviceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDeviceList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceList")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidMatrix(value: AndroidMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidMatrix")(js.undefined)
        ret
    }
  }
  
}

