package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helperMod {
  type UniformLiteralValue = scala.Double | js.Array[scala.Double] | org.scalajs.dom.raw.HTMLCanvasElement | org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.ImageData | typingsSlinky.ol.olMod.Transform
  type UniformValue = typingsSlinky.ol.helperMod.UniformLiteralValue | (js.Function1[
    /* p0 */ typingsSlinky.ol.pluggableMapMod.FrameState, 
    typingsSlinky.ol.helperMod.UniformLiteralValue
  ])
}
