package typingsSlinky.reactBootstrapTable2Paginator.mod

import typingsSlinky.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropdown
import typingsSlinky.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizePerPageDropdownStandaloneProps extends PaginationChildProps {
  var btnContextual: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var variation: js.UndefOr[dropdown | dropup] = js.native
}

object SizePerPageDropdownStandaloneProps {
  @scala.inline
  def apply(): SizePerPageDropdownStandaloneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizePerPageDropdownStandaloneProps]
  }
  @scala.inline
  implicit class SizePerPageDropdownStandalonePropsOps[Self <: SizePerPageDropdownStandaloneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtnContextual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnContextual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnContextual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnContextual")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withVariation(value: dropdown | dropup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variation")(js.undefined)
        ret
    }
  }
  
}

