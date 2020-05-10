package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A route to either a path or a model, and the absolute offset of it.
  */
@js.native
trait IRouteOffset extends js.Object {
  var layer: String = js.native
  var offset: IPoint = js.native
  var route: js.Array[String] = js.native
  var routeKey: String = js.native
}

object IRouteOffset {
  @scala.inline
  def apply(layer: String, offset: IPoint, route: js.Array[String], routeKey: String): IRouteOffset = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], routeKey = routeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteOffset]
  }
  @scala.inline
  implicit class IRouteOffsetOps[Self <: IRouteOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoute(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

