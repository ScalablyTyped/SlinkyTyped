package typingsSlinky.postmark.anon

import typingsSlinky.postmark.messageSupportingTypesMod.LinkClickLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickLocation extends js.Object {
  var ClickLocation: LinkClickLocation = js.native
  var Link: String = js.native
  var Summary: String = js.native
}

object ClickLocation {
  @scala.inline
  def apply(ClickLocation: LinkClickLocation, Link: String, Summary: String): ClickLocation = {
    val __obj = js.Dynamic.literal(ClickLocation = ClickLocation.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickLocation]
  }
  @scala.inline
  implicit class ClickLocationOps[Self <: ClickLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickLocation(value: LinkClickLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClickLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Summary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

