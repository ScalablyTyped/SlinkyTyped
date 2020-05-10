package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAndroidrelease extends js.Object {
  var android_release: String = js.native
  var android_version: String = js.native
  var manufacturer: String = js.native
  var model: String = js.native
}

object AnonAndroidrelease {
  @scala.inline
  def apply(android_release: String, android_version: String, manufacturer: String, model: String): AnonAndroidrelease = {
    val __obj = js.Dynamic.literal(android_release = android_release.asInstanceOf[js.Any], android_version = android_version.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndroidrelease]
  }
  @scala.inline
  implicit class AnonAndroidreleaseOps[Self <: AnonAndroidrelease] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid_release(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroid_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

