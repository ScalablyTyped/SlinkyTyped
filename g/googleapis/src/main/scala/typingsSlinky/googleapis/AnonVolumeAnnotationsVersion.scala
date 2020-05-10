package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVolumeAnnotationsVersion extends js.Object {
  var layerId: js.UndefOr[String] = js.native
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
}

object AnonVolumeAnnotationsVersion {
  @scala.inline
  def apply(): AnonVolumeAnnotationsVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonVolumeAnnotationsVersion]
  }
  @scala.inline
  implicit class AnonVolumeAnnotationsVersionOps[Self <: AnonVolumeAnnotationsVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerId")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeAnnotationsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAnnotationsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeAnnotationsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAnnotationsVersion")(js.undefined)
        ret
    }
  }
  
}

