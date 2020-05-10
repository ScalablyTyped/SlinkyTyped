package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cesium3DTilesetGraphicsOptions extends js.Object {
  /**
    * A number or Property specifying the maximum screen space error used to drive level of detail refinement.
    */
  var maximumScreenSpaceError: js.UndefOr[Double | Property] = js.native
  /**
    * A boolean Property specifying the visibility of the tilese
    * @default true
    */
  var show: js.UndefOr[Boolean | Property] = js.native
  /**
    * A string or Resource Property specifying the URI of the tileset.
    */
  var uri: js.UndefOr[String | Property] = js.native
}

object Cesium3DTilesetGraphicsOptions {
  @scala.inline
  def apply(): Cesium3DTilesetGraphicsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cesium3DTilesetGraphicsOptions]
  }
  @scala.inline
  implicit class Cesium3DTilesetGraphicsOptionsOps[Self <: Cesium3DTilesetGraphicsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumScreenSpaceError(value: Double | Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScreenSpaceError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumScreenSpaceError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumScreenSpaceError")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean | Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String | Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

