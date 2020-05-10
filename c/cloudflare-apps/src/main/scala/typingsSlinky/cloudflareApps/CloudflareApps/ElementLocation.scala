package typingsSlinky.cloudflareApps.CloudflareApps

import typingsSlinky.cloudflareApps.cloudflareAppsStrings.after
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.append
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.before
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.prepend
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementLocation extends js.Object {
  var method: before | prepend | append | after | replace = js.native
  var selector: String = js.native
}

object ElementLocation {
  @scala.inline
  def apply(method: before | prepend | append | after | replace, selector: String): ElementLocation = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementLocation]
  }
  @scala.inline
  implicit class ElementLocationOps[Self <: ElementLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: before | prepend | append | after | replace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

