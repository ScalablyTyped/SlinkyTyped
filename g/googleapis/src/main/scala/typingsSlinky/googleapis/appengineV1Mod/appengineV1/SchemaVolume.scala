package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Volumes mounted within the app container. Only applicable in the App Engine
  * flexible environment.
  */
@js.native
trait SchemaVolume extends js.Object {
  /**
    * Unique name for the volume.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Volume size in gigabytes.
    */
  var sizeGb: js.UndefOr[Double] = js.native
  /**
    * Underlying volume type, e.g. &#39;tmpfs&#39;.
    */
  var volumeType: js.UndefOr[String] = js.native
}

object SchemaVolume {
  @scala.inline
  def apply(): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolume]
  }
  @scala.inline
  implicit class SchemaVolumeOps[Self <: SchemaVolume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeType")(js.undefined)
        ret
    }
  }
  
}

