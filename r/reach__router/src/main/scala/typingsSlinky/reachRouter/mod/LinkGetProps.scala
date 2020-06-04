package typingsSlinky.reachRouter.mod

import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkGetProps extends js.Object {
  var href: String
  var isCurrent: Boolean
  var isPartiallyCurrent: Boolean
  var location: WindowLocation[LocationState]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCurrent(value: Boolean): Self = this.set("isCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPartiallyCurrent(value: Boolean): Self = this.set("isPartiallyCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
  }
  
}

