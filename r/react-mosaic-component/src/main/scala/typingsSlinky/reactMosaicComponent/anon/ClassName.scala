package typingsSlinky.reactMosaicComponent.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: String = js.native
  var zeroStateView: ReactElement = js.native
  def onChange(): js.UndefOr[scala.Nothing] = js.native
}

object ClassName {
  @scala.inline
  def apply(className: String, onChange: () => js.UndefOr[scala.Nothing], zeroStateView: ReactElement): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), zeroStateView = zeroStateView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withZeroStateView(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroStateView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

