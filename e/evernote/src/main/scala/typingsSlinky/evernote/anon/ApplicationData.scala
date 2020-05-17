package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.LazyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationData extends js.Object {
  var altitude: js.UndefOr[Double] = js.native
  var applicationData: js.UndefOr[LazyMap] = js.native
  var attachment: js.UndefOr[Boolean] = js.native
  var cameraMake: js.UndefOr[String] = js.native
  var cameraModel: js.UndefOr[String] = js.native
  var clientWillIndex: js.UndefOr[Boolean] = js.native
  var fileName: js.UndefOr[String] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var recoType: js.UndefOr[String] = js.native
  var sourceURL: js.UndefOr[String] = js.native
  var timestamp: js.UndefOr[Double] = js.native
}

object ApplicationData {
  @scala.inline
  def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  @scala.inline
  implicit class ApplicationDataOps[Self <: ApplicationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationData(value: LazyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationData")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraMake(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraMake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraMake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraMake")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraModel")(js.undefined)
        ret
    }
    @scala.inline
    def withClientWillIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWillIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientWillIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWillIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withRecoType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recoType")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceURL")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

