package typingsSlinky.reactBootstrap.navbarMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarFormProps
  extends AllHTMLAttributes[NavbarForm]
     with ClassAttributes[NavbarForm] {
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.native
  var pullLeft: js.UndefOr[Boolean] = js.native
  var pullRight: js.UndefOr[Boolean] = js.native
}

object NavbarFormProps {
  @scala.inline
  def apply(): NavbarFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarFormProps]
  }
  @scala.inline
  implicit class NavbarFormPropsOps[Self <: NavbarFormProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentClassComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPullLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRight")(js.undefined)
        ret
    }
  }
  
}

