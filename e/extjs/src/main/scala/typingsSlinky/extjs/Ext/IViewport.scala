package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewport
  extends typingsSlinky.extjs.Ext.container.IContainer {
  /** [Property] (Boolean) */
  var isViewport: js.UndefOr[Boolean] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IViewport: js.UndefOr[js.Function0[Unit]] = js.native
}

object IViewport {
  @scala.inline
  def apply(): IViewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewport]
  }
  @scala.inline
  implicit class IViewportOps[Self <: IViewport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsViewport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
  }
  
}

