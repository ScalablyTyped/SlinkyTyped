package typingsSlinky.leafletDashDraw.leafletMod.Localization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draw extends js.Object {
  var handlers: DrawHandlers
  var toolbar: typingsSlinky.leafletDashDraw.leafletMod.Localization.DrawToolbar
}

object Draw {
  @scala.inline
  def apply(handlers: DrawHandlers, toolbar: typingsSlinky.leafletDashDraw.leafletMod.Localization.DrawToolbar): Draw = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Draw]
  }
}

