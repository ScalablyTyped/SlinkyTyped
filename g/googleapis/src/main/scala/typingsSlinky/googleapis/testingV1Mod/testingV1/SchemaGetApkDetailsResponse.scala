package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing the details of the specified Android application APK.
  */
@js.native
trait SchemaGetApkDetailsResponse extends js.Object {
  /**
    * Details of the Android APK.
    */
  var apkDetail: js.UndefOr[SchemaApkDetail] = js.native
}

object SchemaGetApkDetailsResponse {
  @scala.inline
  def apply(): SchemaGetApkDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetApkDetailsResponse]
  }
  @scala.inline
  implicit class SchemaGetApkDetailsResponseOps[Self <: SchemaGetApkDetailsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApkDetail(value: SchemaApkDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apkDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApkDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apkDetail")(js.undefined)
        ret
    }
  }
  
}

