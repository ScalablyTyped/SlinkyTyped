package typingsSlinky.reactNativeNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassProps extends js.Object {
  var name: String = js.native
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.native
}

object PassProps {
  @scala.inline
  def apply(name: String): PassProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassProps]
  }
  @scala.inline
  implicit class PassPropsOps[Self <: PassProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passProps")(js.undefined)
        ret
    }
  }
  
}

