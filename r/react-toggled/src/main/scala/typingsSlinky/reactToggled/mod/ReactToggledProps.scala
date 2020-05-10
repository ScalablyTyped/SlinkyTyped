package typingsSlinky.reactToggled.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactToggledProps extends js.Object {
  val children: ChildrenFunction = js.native
  val defaultOn: js.UndefOr[Boolean] = js.native
  val on: js.UndefOr[Boolean] = js.native
  val onToggle: js.UndefOr[js.Function2[/* on */ Boolean, /* object */ TogglerStateAndHelpers, Unit]] = js.native
}

object ReactToggledProps {
  @scala.inline
  def apply(children: /* options */ TogglerStateAndHelpers => TagMod[Any]): ReactToggledProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ReactToggledProps]
  }
  @scala.inline
  implicit class ReactToggledPropsOps[Self <: ReactToggledProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: /* options */ TogglerStateAndHelpers => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefaultOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOn")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggle(value: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
  }
  
}

