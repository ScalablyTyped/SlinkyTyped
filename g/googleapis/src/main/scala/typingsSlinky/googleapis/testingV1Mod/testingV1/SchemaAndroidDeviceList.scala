package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Android device configurations in which the test is to be
  * executed.
  */
@js.native
trait SchemaAndroidDeviceList extends js.Object {
  /**
    * Required. A list of Android devices.
    */
  var androidDevices: js.UndefOr[js.Array[SchemaAndroidDevice]] = js.native
}

object SchemaAndroidDeviceList {
  @scala.inline
  def apply(): SchemaAndroidDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDeviceList]
  }
  @scala.inline
  implicit class SchemaAndroidDeviceListOps[Self <: SchemaAndroidDeviceList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidDevices(value: js.Array[SchemaAndroidDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevices")(js.undefined)
        ret
    }
  }
  
}

