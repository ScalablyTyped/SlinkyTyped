package typingsSlinky.oracleOraclejet.ojmoduleanimationsMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitcherCallBackParam extends js.Object {
  var isInitial: Boolean = js.native
  var newViewModel: js.Any = js.native
  var node: Element = js.native
  var oldViewModel: js.Any = js.native
  def valueAccessor(): js.Any = js.native
}

object SwitcherCallBackParam {
  @scala.inline
  def apply(
    isInitial: Boolean,
    newViewModel: js.Any,
    node: Element,
    oldViewModel: js.Any,
    valueAccessor: () => js.Any
  ): SwitcherCallBackParam = {
    val __obj = js.Dynamic.literal(isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any], valueAccessor = js.Any.fromFunction0(valueAccessor))
    __obj.asInstanceOf[SwitcherCallBackParam]
  }
  @scala.inline
  implicit class SwitcherCallBackParamOps[Self <: SwitcherCallBackParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInitial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewViewModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldViewModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueAccessor(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAccessor")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

