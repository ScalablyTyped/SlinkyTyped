package typingsSlinky.reachRouter.mod

import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkGetProps extends js.Object {
  var href: String = js.native
  var isCurrent: Boolean = js.native
  var isPartiallyCurrent: Boolean = js.native
  var location: WindowLocation[LocationState] = js.native
}

object LinkGetProps {
  @scala.inline
  def apply(
    href: String,
    isCurrent: Boolean,
    isPartiallyCurrent: Boolean,
    location: WindowLocation[LocationState]
  ): LinkGetProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], isCurrent = isCurrent.asInstanceOf[js.Any], isPartiallyCurrent = isPartiallyCurrent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkGetProps]
  }
  @scala.inline
  implicit class LinkGetPropsOps[Self <: LinkGetProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPartiallyCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPartiallyCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: WindowLocation[LocationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

