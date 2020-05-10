package typingsSlinky.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentProps extends js.Object {
  var forNoMatch: js.UndefOr[Boolean] = js.native
  var forRoute: js.UndefOr[String] = js.native
  var location: js.UndefOr[Location] = js.native
  var matchRoute: js.UndefOr[js.Function] = js.native
  var matchWildcardRoute: js.UndefOr[js.Function] = js.native
  var parentId: js.UndefOr[String] = js.native
  var parentRoute: js.UndefOr[String] = js.native
  var style: js.UndefOr[ObjectLiteral[_]] = js.native
  var withConditions: js.UndefOr[js.Function1[/* location */ Location, Boolean]] = js.native
}

object FragmentProps {
  @scala.inline
  def apply(): FragmentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentProps]
  }
  @scala.inline
  implicit class FragmentPropsOps[Self <: FragmentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForNoMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forNoMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForNoMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forNoMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withForRoute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchRoute(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchWildcardRoute(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWildcardRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchWildcardRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWildcardRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withParentRoute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ObjectLiteral[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withWithConditions(value: /* location */ Location => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withConditions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWithConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withConditions")(js.undefined)
        ret
    }
  }
  
}

