package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.withViewportMod.IViewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewport extends js.Object {
  var viewport: js.UndefOr[IViewport] = js.native
}

object Viewport {
  @scala.inline
  def apply(): Viewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Viewport]
  }
  @scala.inline
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewport(value: IViewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
  }
  
}

