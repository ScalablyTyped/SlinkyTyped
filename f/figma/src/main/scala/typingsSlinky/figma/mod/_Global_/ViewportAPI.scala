package typingsSlinky.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportAPI extends js.Object {
  val bounds: Rect = js.native
  var center: Vector = js.native
  var zoom: Double = js.native
  def scrollAndZoomIntoView(nodes: js.Array[BaseNode]): Unit = js.native
}

object ViewportAPI {
  @scala.inline
  def apply(bounds: Rect, center: Vector, scrollAndZoomIntoView: js.Array[BaseNode] => Unit, zoom: Double): ViewportAPI = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], scrollAndZoomIntoView = js.Any.fromFunction1(scrollAndZoomIntoView), zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportAPI]
  }
  @scala.inline
  implicit class ViewportAPIOps[Self <: ViewportAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollAndZoomIntoView(value: js.Array[BaseNode] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAndZoomIntoView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

