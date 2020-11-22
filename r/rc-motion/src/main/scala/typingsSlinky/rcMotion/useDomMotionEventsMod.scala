package typingsSlinky.rcMotion

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcMotion.interfaceMod.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-motion/es/hooks/useDomMotionEvents", JSImport.Namespace)
@js.native
object useDomMotionEventsMod extends js.Object {
  
  def default(callback: js.Function1[/* event */ MotionEvent, Unit]): js.Tuple2[
    js.Function1[/* element */ HTMLElement, Unit], 
    js.Function1[/* element */ HTMLElement, Unit]
  ] = js.native
}
