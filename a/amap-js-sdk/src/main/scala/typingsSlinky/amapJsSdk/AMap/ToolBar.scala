package typingsSlinky.amapJsSdk.AMap

import typingsSlinky.amapJsSdk.AnonAutoPosition
import typingsSlinky.amapJsSdk.AnonLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ToolBar")
@js.native
class ToolBar ()
  extends EventBindable
     with MapControl {
  def this(options: AnonAutoPosition) = this()
  def doLocation(): Unit = js.native
  def getLocation(): AnonLat = js.native
  def getOffset(): Pixel = js.native
  def hideDirection(): Unit = js.native
  def hideLocation(): Unit = js.native
  def hideRuler(): Unit = js.native
  def setOffset(offset: Pixel): Unit = js.native
  def showDirection(): Unit = js.native
  def showLocation(): Unit = js.native
  def showRuler(): Unit = js.native
}

