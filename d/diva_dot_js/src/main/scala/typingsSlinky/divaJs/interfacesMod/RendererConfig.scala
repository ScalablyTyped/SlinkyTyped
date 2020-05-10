package typingsSlinky.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererConfig extends js.Object {
  var maxZoomLevel: Double | Null = js.native
  var padding: Offset = js.native
  var pageLayouts: js.Object = js.native
  var verticallyOriented: Boolean = js.native
}

object RendererConfig {
  @scala.inline
  def apply(padding: Offset, pageLayouts: js.Object, verticallyOriented: Boolean): RendererConfig = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], pageLayouts = pageLayouts.asInstanceOf[js.Any], verticallyOriented = verticallyOriented.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererConfig]
  }
  @scala.inline
  implicit class RendererConfigOps[Self <: RendererConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageLayouts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLayouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticallyOriented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticallyOriented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxZoomLevelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(null)
        ret
    }
  }
  
}

