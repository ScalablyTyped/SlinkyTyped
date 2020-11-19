package typingsSlinky.popmotion

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import typingsSlinky.popmotion.pointerTypesMod.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/input/pointer/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def defaultPointerPos(): PointerPoint = js.native
  
  def eventToPoint(e: MouseEvent): PointerPoint = js.native
  def eventToPoint(e: MouseEvent, point: PointerPoint): PointerPoint = js.native
  def eventToPoint(e: Touch): PointerPoint = js.native
  def eventToPoint(e: Touch, point: PointerPoint): PointerPoint = js.native
}
