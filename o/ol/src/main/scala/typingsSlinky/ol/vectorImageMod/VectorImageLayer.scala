package typingsSlinky.ol.vectorImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorImageLayer
  extends typingsSlinky.ol.baseVectorMod.default[
      typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default] | typingsSlinky.ol.sourceVectorTileMod.default
    ] {
  def getImageRatio(): Double = js.native
}

