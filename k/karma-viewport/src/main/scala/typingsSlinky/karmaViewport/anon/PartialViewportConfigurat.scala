package typingsSlinky.karmaViewport.anon

import typingsSlinky.karmaViewport.viewportMod.ViewportBreakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<karma-viewport.karma-viewport/dist/adapter/viewport.ViewportConfiguration> */
@js.native
trait PartialViewportConfigurat extends js.Object {
  var breakpoints: js.UndefOr[js.Array[ViewportBreakpoint]] = js.native
  var context: js.UndefOr[String] = js.native
}

object PartialViewportConfigurat {
  @scala.inline
  def apply(): PartialViewportConfigurat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialViewportConfigurat]
  }
  @scala.inline
  implicit class PartialViewportConfiguratOps[Self <: PartialViewportConfigurat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoints(value: js.Array[ViewportBreakpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
  }
  
}

