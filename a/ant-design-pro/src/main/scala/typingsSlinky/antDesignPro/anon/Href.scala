package typingsSlinky.antDesignPro.anon

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Href extends js.Object {
  var href: js.UndefOr[LocationDescriptor[LocationState]] = js.native
  var innerRef: js.UndefOr[js.Function1[/* node */ HTMLAnchorElement | Null, Unit]] = js.native
  var replace: js.UndefOr[Boolean] = js.native
  var to: LocationDescriptor[LocationState] = js.native
}

object Href {
  @scala.inline
  def apply(to: LocationDescriptor[LocationState]): Href = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  @scala.inline
  implicit class HrefOps[Self <: Href] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTo(value: LocationDescriptor[LocationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: LocationDescriptor[LocationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRef(value: /* node */ HTMLAnchorElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInnerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
  }
  
}

