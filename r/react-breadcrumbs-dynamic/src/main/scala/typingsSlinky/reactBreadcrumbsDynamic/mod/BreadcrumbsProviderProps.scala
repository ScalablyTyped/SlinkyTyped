package typingsSlinky.reactBreadcrumbsDynamic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbsProviderProps extends js.Object {
  var shouldBreadcrumbsUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object BreadcrumbsProviderProps {
  @scala.inline
  def apply(): BreadcrumbsProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbsProviderProps]
  }
  @scala.inline
  implicit class BreadcrumbsProviderPropsOps[Self <: BreadcrumbsProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShouldBreadcrumbsUpdate(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBreadcrumbsUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldBreadcrumbsUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldBreadcrumbsUpdate")(js.undefined)
        ret
    }
  }
  
}

