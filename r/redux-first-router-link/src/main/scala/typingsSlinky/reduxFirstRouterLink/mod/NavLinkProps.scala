package typingsSlinky.reduxFirstRouterLink.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reduxFirstRouter.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavLinkProps extends LinkProps {
  var activeClassName: js.UndefOr[String] = js.native
  var activeStyle: js.UndefOr[CSSProperties] = js.native
  var ariaCurrent: js.UndefOr[String] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var isActive: js.UndefOr[js.Function2[/* match */ Match[js.Object], /* location */ Location, Boolean]] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object NavLinkProps {
  @scala.inline
  def apply(to: To): NavLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavLinkProps]
  }
  @scala.inline
  implicit class NavLinkPropsOps[Self <: NavLinkProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaCurrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: (/* match */ Match[js.Object], /* location */ Location) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

