package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveMode extends js.Object {
  var responsiveMode: js.UndefOr[typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode] = js.undefined
}

object ResponsiveMode {
  @scala.inline
  def apply(responsiveMode: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode = null): ResponsiveMode = {
    val __obj = js.Dynamic.literal()
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveMode]
  }
}

