package typingsSlinky.divaJs.interfacesMod

import typingsSlinky.divaJs.AnonAhei
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestData extends js.Object {
  var dims: AnonAhei = js.native
  var item_title: String = js.native
  var max_zoom: Double = js.native
  var metadata: js.Object = js.native
  var paged: Boolean = js.native
  var pgs: js.Array[Page] = js.native
  var version: js.UndefOr[Double] = js.native
}

object ManifestData {
  @scala.inline
  def apply(
    dims: AnonAhei,
    item_title: String,
    max_zoom: Double,
    metadata: js.Object,
    paged: Boolean,
    pgs: js.Array[Page]
  ): ManifestData = {
    val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any], item_title = item_title.asInstanceOf[js.Any], max_zoom = max_zoom.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], pgs = pgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestData]
  }
  @scala.inline
  implicit class ManifestDataOps[Self <: ManifestData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDims(value: AnonAhei): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_zoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPgs(value: js.Array[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

