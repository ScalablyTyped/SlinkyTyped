package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Derived describes the derived image portion (Occurrence) of the DockerImage
  * relationship. This image would be produced from a Dockerfile with FROM
  * &lt;DockerImage.Basis in attached Note&gt;.
  */
@js.native
trait SchemaDerived extends js.Object {
  /**
    * Output only. This contains the base image URL for the derived image
    * occurrence.
    */
  var baseResourceUrl: js.UndefOr[String] = js.native
  /**
    * Output only. The number of layers by which this image differs from the
    * associated image basis.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * Required. The fingerprint of the derived image.
    */
  var fingerprint: js.UndefOr[SchemaFingerprint] = js.native
  /**
    * This contains layer-specific metadata, if populated it has length
    * &quot;distance&quot; and is ordered with [distance] being the layer
    * immediately following the base image and [1] being the final layer.
    */
  var layerInfo: js.UndefOr[js.Array[SchemaLayer]] = js.native
}

object SchemaDerived {
  @scala.inline
  def apply(): SchemaDerived = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDerived]
  }
  @scala.inline
  implicit class SchemaDerivedOps[Self <: SchemaDerived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseResourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseResourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseResourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseResourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: SchemaFingerprint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerInfo(value: js.Array[SchemaLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerInfo")(js.undefined)
        ret
    }
  }
  
}

