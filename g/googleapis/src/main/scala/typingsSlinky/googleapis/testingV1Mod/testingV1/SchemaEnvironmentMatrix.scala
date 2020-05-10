package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matrix of environments in which the test is to be executed.
  */
@js.native
trait SchemaEnvironmentMatrix extends js.Object {
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[SchemaAndroidDeviceList] = js.native
  /**
    * A matrix of Android devices.
    */
  var androidMatrix: js.UndefOr[SchemaAndroidMatrix] = js.native
  /**
    * A list of iOS devices.
    */
  var iosDeviceList: js.UndefOr[SchemaIosDeviceList] = js.native
}

object SchemaEnvironmentMatrix {
  @scala.inline
  def apply(): SchemaEnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentMatrix]
  }
  @scala.inline
  implicit class SchemaEnvironmentMatrixOps[Self <: SchemaEnvironmentMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidDeviceList(value: SchemaAndroidDeviceList): Self = {
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
    def withAndroidMatrix(value: SchemaAndroidMatrix): Self = {
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
    @scala.inline
    def withIosDeviceList(value: SchemaIosDeviceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDeviceList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosDeviceList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDeviceList")(js.undefined)
        ret
    }
  }
  
}

