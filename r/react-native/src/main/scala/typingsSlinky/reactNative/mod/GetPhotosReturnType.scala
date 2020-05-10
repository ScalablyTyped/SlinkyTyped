package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.AnonHasnextpage
import typingsSlinky.reactNative.AnonNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPhotosReturnType extends js.Object {
  var edges: js.Array[AnonNode] = js.native
  var page_info: AnonHasnextpage = js.native
}

object GetPhotosReturnType {
  @scala.inline
  def apply(edges: js.Array[AnonNode], page_info: AnonHasnextpage): GetPhotosReturnType = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhotosReturnType]
  }
  @scala.inline
  implicit class GetPhotosReturnTypeOps[Self <: GetPhotosReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(value: js.Array[AnonNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_info(value: AnonHasnextpage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_info")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

