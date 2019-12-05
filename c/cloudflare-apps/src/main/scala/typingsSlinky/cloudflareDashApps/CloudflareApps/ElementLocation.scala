package typingsSlinky.cloudflareDashApps.CloudflareApps

import typingsSlinky.cloudflareDashApps.cloudflareDashAppsStrings.after
import typingsSlinky.cloudflareDashApps.cloudflareDashAppsStrings.append
import typingsSlinky.cloudflareDashApps.cloudflareDashAppsStrings.before
import typingsSlinky.cloudflareDashApps.cloudflareDashAppsStrings.prepend
import typingsSlinky.cloudflareDashApps.cloudflareDashAppsStrings.replace
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

