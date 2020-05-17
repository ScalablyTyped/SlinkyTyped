package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeAnnotationsVersion extends js.Object {
  /** The layer id of this layer (e.g. "geo"). */
  var layerId: js.UndefOr[String] = js.native
  /**
    * The current version of this layer's volume annotations. Note that this version applies only to the data in the books.layers.volumeAnnotations.&#42;
    * responses. The actual annotation data is versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
}

object VolumeAnnotationsVersion {
  @scala.inline
  def apply(): VolumeAnnotationsVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeAnnotationsVersion]
  }
  @scala.inline
  implicit class VolumeAnnotationsVersionOps[Self <: VolumeAnnotationsVersion] (val x: Self) extends AnyVal {
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

