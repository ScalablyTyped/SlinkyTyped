package typingsSlinky.ol.iconMod

import typingsSlinky.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon
  extends typingsSlinky.ol.styleImageMod.default {
  
  def getColor(): Color = js.native
  
  def getSrc(): String = js.native
  
  def setAnchor(anchor: js.Array[Double]): Unit = js.native
}
