package typingsSlinky.linguiReact.createFormatMod

import typingsSlinky.linguiReact.renderMod.RenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatPropsWithoutI18n[V, FormatOptions] extends RenderProps {
  var format: js.UndefOr[FormatOptions] = js.native
  var value: V = js.native
}

object FormatPropsWithoutI18n {
  @scala.inline
  def apply[V, FormatOptions](value: V): FormatPropsWithoutI18n[V, FormatOptions] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatPropsWithoutI18n[V, FormatOptions]]
  }
  @scala.inline
  implicit class FormatPropsWithoutI18nOps[Self[v, formatoptions] <: FormatPropsWithoutI18n[v, formatoptions], V, FormatOptions] (val x: Self[V, FormatOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, FormatOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, FormatOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, FormatOptions]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, FormatOptions]) with Other]
    @scala.inline
    def withValue(value: V): Self[V, FormatOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: FormatOptions): Self[V, FormatOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self[V, FormatOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

