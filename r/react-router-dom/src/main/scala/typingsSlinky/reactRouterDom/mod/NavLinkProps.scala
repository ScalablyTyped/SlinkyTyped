package typingsSlinky.reactRouterDom.mod

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavLinkProps[S] extends LinkProps[S] {
  var activeClassName: js.UndefOr[String] = js.native
  var activeStyle: js.UndefOr[CSSProperties] = js.native
  var exact: js.UndefOr[Boolean] = js.native
  var isActive: js.UndefOr[js.Function2[/* match */ `match`[_] | Null, /* location */ Location[S], Boolean]] = js.native
  var location: js.UndefOr[Location[S]] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object NavLinkProps {
  @scala.inline
  def apply[S](to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): NavLinkProps[S] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavLinkProps[S]]
  }
  @scala.inline
  implicit class NavLinkPropsOps[Self[s] <: NavLinkProps[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withActiveClassName(value: String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClassName: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveStyle(value: CSSProperties): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveStyle: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withExact(value: Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: (/* match */ `match`[_] | Null, /* location */ Location[S]) => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsActive: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

