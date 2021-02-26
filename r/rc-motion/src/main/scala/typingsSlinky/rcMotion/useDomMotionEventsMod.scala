package typingsSlinky.rcMotion

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.rcMotion.interfaceMod.MotionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDomMotionEventsMod {
  
  @JSImport("rc-motion/es/hooks/useDomMotionEvents", JSImport.Default)
  @js.native
  def default(callback: js.Function1[/* event */ MotionEvent, Unit]): js.Tuple2[
    js.Function1[/* element */ HTMLElement, Unit], 
    js.Function1[/* element */ HTMLElement, Unit]
  ] = js.native
}
