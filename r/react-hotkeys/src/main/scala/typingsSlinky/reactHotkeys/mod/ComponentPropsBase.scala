package typingsSlinky.reactHotkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentPropsBase extends js.Object {
  /**
    * The value of the HTML tabindex attribute the root node will have
    */
  var tabIndex: TabIndex = js.native
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onBlur(): Unit = js.native
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onFocus(): Unit = js.native
}

object ComponentPropsBase {
  @scala.inline
  def apply(onBlur: () => Unit, onFocus: () => Unit, tabIndex: TabIndex): ComponentPropsBase = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsBase]
  }
  @scala.inline
  implicit class ComponentPropsBaseOps[Self <: ComponentPropsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTabIndex(value: TabIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

