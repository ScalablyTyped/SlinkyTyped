package typingsSlinky.novncCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Touch
import org.scalajs.dom.raw.TouchList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("novnc-core/lib/util/events", "getPointerEvent")
  @js.native
  def getPointerEvent(event: Event): TouchList | js.Array[Touch] = js.native
  
  @JSImport("novnc-core/lib/util/events", "releaseCapture")
  @js.native
  def releaseCapture(): Unit = js.native
  
  @JSImport("novnc-core/lib/util/events", "setCapture")
  @js.native
  def setCapture(el: Element): Unit = js.native
  
  @JSImport("novnc-core/lib/util/events", "stopEvent")
  @js.native
  def stopEvent(event: Event): Unit = js.native
}
