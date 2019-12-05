package typingsSlinky.ol.styleIconMod

import typingsSlinky.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon
  extends typingsSlinky.ol.styleImageMod.default {
  def getColor(): Color = js.native
  def getSrc(): js.UndefOr[String] = js.native
  def setAnchor(anchor: js.Array[Double]): Unit = js.native
}

