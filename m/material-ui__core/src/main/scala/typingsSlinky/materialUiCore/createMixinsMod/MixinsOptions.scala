package typingsSlinky.materialUiCore.createMixinsMod

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createMixins.Mixins> */
@js.native
trait MixinsOptions extends js.Object {
  var gutters: js.UndefOr[js.Function1[/* styles */ js.UndefOr[CSSProperties], CSSProperties]] = js.native
  var toolbar: js.UndefOr[CSSProperties] = js.native
}

object MixinsOptions {
  @scala.inline
  def apply(): MixinsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixinsOptions]
  }
  @scala.inline
  implicit class MixinsOptionsOps[Self <: MixinsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGutters(value: /* styles */ js.UndefOr[CSSProperties] => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGutters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutters")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
  }
  
}

