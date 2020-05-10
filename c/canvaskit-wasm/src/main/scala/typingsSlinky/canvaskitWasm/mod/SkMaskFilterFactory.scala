package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkMaskFilterFactory extends js.Object {
  def MakeBlur(blurStyle: SkBlurStyle, radius: Double, b: Boolean): SkMaskFilter = js.native
}

object SkMaskFilterFactory {
  @scala.inline
  def apply(MakeBlur: (SkBlurStyle, Double, Boolean) => SkMaskFilter): SkMaskFilterFactory = {
    val __obj = js.Dynamic.literal(MakeBlur = js.Any.fromFunction3(MakeBlur))
    __obj.asInstanceOf[SkMaskFilterFactory]
  }
  @scala.inline
  implicit class SkMaskFilterFactoryOps[Self <: SkMaskFilterFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMakeBlur(value: (SkBlurStyle, Double, Boolean) => SkMaskFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MakeBlur")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

