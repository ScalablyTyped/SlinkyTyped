package typingsSlinky.novncCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Touch
import org.scalajs.dom.raw.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("novnc-core/lib/util/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  
  def getPointerEvent(event: Event): TouchList | js.Array[Touch] = js.native
  
  def releaseCapture(): Unit = js.native
  
  def setCapture(el: Element): Unit = js.native
  
  def stopEvent(event: Event): Unit = js.native
}
