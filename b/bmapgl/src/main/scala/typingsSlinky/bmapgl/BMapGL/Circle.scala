package typingsSlinky.bmapgl.BMapGL

import typingsSlinky.bmapgl.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle extends Overlay {
  
  def disableEditing(): Unit = js.native
  
  def disableMassClear(): Unit = js.native
  
  def enableEditing(): Unit = js.native
  
  def enableMassClear(): Unit = js.native
  
  def getBounds(): Bounds = js.native
  
  def getCenter(): Point = js.native
  
  def getFillColor(): String = js.native
  
  def getFillOpacity(): Double = js.native
  
  def getMap(): Map = js.native
  
  def getRadius(): Double = js.native
  
  def getStrokeColor(): String = js.native
  
  def getStrokeOpacity(): Double = js.native
  
  def getStrokeStyle(): String = js.native
  
  def getStrokeWeight(): Double = js.native
  
  def onclick(event: Target): Unit = js.native
  
  def ondblclick(event: typingsSlinky.bmapgl.anon.Pixel): Unit = js.native
  
  def onlineupdate(event: Target): Unit = js.native
  
  def onmousedown(event: typingsSlinky.bmapgl.anon.Pixel): Unit = js.native
  
  def onmouseout(event: typingsSlinky.bmapgl.anon.Pixel): Unit = js.native
  
  def onmouseover(event: typingsSlinky.bmapgl.anon.Pixel): Unit = js.native
  
  def onmouseup(event: typingsSlinky.bmapgl.anon.Pixel): Unit = js.native
  
  def onremove(event: Target): Unit = js.native
  
  def setCenter(center: Point): Unit = js.native
  
  def setFillColor(color: String): Unit = js.native
  
  def setFillOpacity(opacity: Double): Unit = js.native
  
  def setRadius(radius: Double): Unit = js.native
  
  def setStrokeColor(color: String): Unit = js.native
  
  def setStrokeOpacity(opacity: Double): Unit = js.native
  
  def setStrokeStyle(style: String): Unit = js.native
  
  def setStrokeWeight(weight: Double): Unit = js.native
}
