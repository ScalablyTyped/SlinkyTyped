package typingsSlinky.rbx

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.columnMod.ColumnBreakpointOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDesktop[TAsComponent /* <: ReactElement */] extends js.Object {
  var as: js.UndefOr[TAsComponent] = js.native
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.native
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.native
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.native
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.native
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.native
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.native
}

object AnonDesktop {
  @scala.inline
  def apply[TAsComponent](): AnonDesktop[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDesktop[TAsComponent]]
  }
  @scala.inline
  implicit class AnonDesktopOps[Self[tascomponent] <: AnonDesktop[tascomponent], TAsComponent] (val x: Self[TAsComponent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TAsComponent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TAsComponent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TAsComponent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TAsComponent] with Other]
    @scala.inline
    def withAs(value: TAsComponent): Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktop(value: ColumnBreakpointOptions): Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktop: Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withFullhd(value: ColumnBreakpointOptions): Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullhd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullhd: Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullhd")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: ColumnBreakpointOptions): Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withTablet(value: ColumnBreakpointOptions): Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablet: Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: ColumnBreakpointOptions): Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
    @scala.inline
    def withWidescreen(value: ColumnBreakpointOptions): Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidescreen: Self[TAsComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(js.undefined)
        ret
    }
  }
  
}

