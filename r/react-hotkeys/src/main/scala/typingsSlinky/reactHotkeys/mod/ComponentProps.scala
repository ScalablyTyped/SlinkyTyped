package typingsSlinky.reactHotkeys.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentProps extends ComponentPropsBase {
  var ref: js.UndefOr[MutableRefObject[ReactComponentClass[js.Object]]] = js.native
}

object ComponentProps {
  @scala.inline
  def apply(onBlur: () => Unit, onFocus: () => Unit, tabIndex: TabIndex): ComponentProps = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
  @scala.inline
  implicit class ComponentPropsOps[Self <: ComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRef(value: MutableRefObject[ReactComponentClass[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
  }
  
}

