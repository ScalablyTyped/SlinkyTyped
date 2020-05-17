package typingsSlinky.primereact.listBoxHeaderMod

import typingsSlinky.primereact.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxHeaderProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[String] = js.native
  var onFilter: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
}

object ListBoxHeaderProps {
  @scala.inline
  def apply(): ListBoxHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxHeaderProps]
  }
  @scala.inline
  implicit class ListBoxHeaderPropsOps[Self <: ListBoxHeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilter(value: /* e */ Value => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilter")(js.undefined)
        ret
    }
  }
  
}

