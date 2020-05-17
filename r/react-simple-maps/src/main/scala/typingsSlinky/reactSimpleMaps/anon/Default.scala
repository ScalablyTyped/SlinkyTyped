package typingsSlinky.reactSimpleMaps.anon

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default extends js.Object {
  var default: js.UndefOr[CSSProperties] = js.native
  var hover: js.UndefOr[CSSProperties] = js.native
  var pressed: js.UndefOr[CSSProperties] = js.native
}

object Default {
  @scala.inline
  def apply(): Default = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Default]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withPressed(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(js.undefined)
        ret
    }
  }
  
}

