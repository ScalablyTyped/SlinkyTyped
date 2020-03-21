package typingsSlinky.ol.fillMod

import typingsSlinky.ol.colorMod.Color
import typingsSlinky.ol.colorlikeMod.ColorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fill extends js.Object {
  def getColor(): Color | ColorLike = js.native
  def setColor(color: Color): Unit = js.native
  def setColor(color: ColorLike): Unit = js.native
}

