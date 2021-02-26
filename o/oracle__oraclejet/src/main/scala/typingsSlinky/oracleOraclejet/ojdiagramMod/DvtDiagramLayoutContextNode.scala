package typingsSlinky.oracleOraclejet.ojdiagramMod

import typingsSlinky.oracleOraclejet.anon.H
import typingsSlinky.oracleOraclejet.anon.Y
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.baseline
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.left
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.middle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.right
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvtDiagramLayoutContextNode extends StObject {
  
  def getBounds(): H = js.native
  
  def getChildNodes(): js.Array[_] = js.native
  
  def getContentBounds(): H = js.native
  
  def getData(): js.Object = js.native
  
  def getId(): js.Any = js.native
  
  def getLabelBounds(): H = js.native
  
  def getLabelHalign(): left | center | right = js.native
  
  def getLabelPosition(): Y = js.native
  
  def getLabelRotationAngle(): Double = js.native
  
  def getLabelRotationPoint(): Y = js.native
  
  def getLabelValign(): top | middle | bottom | baseline = js.native
  
  def getPosition(): Y = js.native
  
  def getRelativePosition(containerId: js.Any): Y = js.native
  
  def getSelected(): Boolean = js.native
  
  def isDisclosed(): Boolean = js.native
  
  @JSName("setLabelHalign")
  def setLabelHalign_center(halign: center): Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_left(halign: left): Unit = js.native
  @JSName("setLabelHalign")
  def setLabelHalign_right(halign: right): Unit = js.native
  
  def setLabelPosition(pos: Y): Unit = js.native
  
  def setLabelRotationAngle(angle: Double): Unit = js.native
  
  def setLabelRotationPoint(point: Y): Unit = js.native
  
  @JSName("setLabelValign")
  def setLabelValign_baseline(valign: baseline): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_bottom(valign: bottom): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_middle(valign: middle): Unit = js.native
  @JSName("setLabelValign")
  def setLabelValign_top(valign: top): Unit = js.native
  
  def setPosition(pos: Y): Unit = js.native
}
