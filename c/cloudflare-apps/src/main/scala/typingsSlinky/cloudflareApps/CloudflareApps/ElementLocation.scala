package typingsSlinky.cloudflareApps.CloudflareApps

import typingsSlinky.cloudflareApps.cloudflareAppsStrings.after
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.append
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.before
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.prepend
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementLocation extends js.Object {
  var method: before | prepend | append | after | replace
  var selector: String
}

object ElementLocation {
  @scala.inline
  def apply(method: before | prepend | append | after | replace, selector: String): ElementLocation = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ElementLocation]
  }
}

