package typingsSlinky.rcAlign

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcAlign.interfaceMod.TargetPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-align/es/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def isSamePoint(prev: TargetPoint, next: TargetPoint): Boolean = js.native
  
  def monitorResize(element: HTMLElement, callback: js.Function): js.Function0[Unit] = js.native
  
  def restoreFocus(activeElement: js.Any, container: js.Any): Unit = js.native
}
