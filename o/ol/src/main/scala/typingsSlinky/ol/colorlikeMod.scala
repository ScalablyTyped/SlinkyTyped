package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import typingsSlinky.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorlikeMod {
  
  @JSImport("ol/colorlike", "asColorLike")
  @js.native
  def asColorLike(color: Color): ColorLike = js.native
  @JSImport("ol/colorlike", "asColorLike")
  @js.native
  def asColorLike(color: ColorLike): ColorLike = js.native
  
  type ColorLike = String | CanvasPattern | CanvasGradient
}
