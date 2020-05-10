package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonEndcursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraRollAssetInfo extends js.Object {
  var edges: js.Array[CameraRollEdgeInfo] = js.native
  var page_info: AnonEndcursor = js.native
}

object CameraRollAssetInfo {
  @scala.inline
  def apply(edges: js.Array[CameraRollEdgeInfo], page_info: AnonEndcursor): CameraRollAssetInfo = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollAssetInfo]
  }
  @scala.inline
  implicit class CameraRollAssetInfoOps[Self <: CameraRollAssetInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(value: js.Array[CameraRollEdgeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_info(value: AnonEndcursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_info")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

