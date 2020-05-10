package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  /**
    * The availability status of the image layer.
    */
  var layerAvailability: js.UndefOr[LayerAvailability] = js.native
  /**
    * The sha256 digest of the image layer.
    */
  var layerDigest: js.UndefOr[LayerDigest] = js.native
  /**
    * The size, in bytes, of the image layer.
    */
  var layerSize: js.UndefOr[LayerSizeInBytes] = js.native
  /**
    * The media type of the layer, such as application/vnd.docker.image.rootfs.diff.tar.gzip or application/vnd.oci.image.layer.v1.tar+gzip.
    */
  var mediaType: js.UndefOr[MediaType] = js.native
}

object Layer {
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerAvailability(value: LayerAvailability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerDigest(value: LayerDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerSize(value: LayerSizeInBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: MediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
  }
  
}

