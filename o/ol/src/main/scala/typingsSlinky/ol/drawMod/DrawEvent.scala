package typingsSlinky.ol.drawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/interaction/Draw", "DrawEvent")
@js.native
class DrawEvent protected ()
  extends typingsSlinky.ol.eventMod.default {
  def this(
    `type`: DrawEventType,
    feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]
  ) = this()
  
  var feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
}
