package typingsSlinky.cesium.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.cesium.mod.DefaultProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearOnDrop extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.native
  var clearOnDrop: js.UndefOr[Boolean] = js.native
  var dropTarget: js.UndefOr[Element | String] = js.native
  var flyToOnDrop: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[DefaultProxy] = js.native
}

object ClearOnDrop {
  @scala.inline
  def apply(): ClearOnDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearOnDrop]
  }
  @scala.inline
  implicit class ClearOnDropOps[Self <: ClearOnDrop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClampToGround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClampToGround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(js.undefined)
        ret
    }
    @scala.inline
    def withClearOnDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withDropTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropTarget(value: Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withFlyToOnDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyToOnDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlyToOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flyToOnDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: DefaultProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
  }
  
}

