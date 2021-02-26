package typingsSlinky.rcProgress.components

import typingsSlinky.rcProgress.interfaceMod.ProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Circle {
  
  @JSImport("rc-progress", "default.Circle")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Circle.type): SharedBuilder_ProgressProps_555392113 = new SharedBuilder_ProgressProps_555392113(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProgressProps): SharedBuilder_ProgressProps_555392113 = new SharedBuilder_ProgressProps_555392113(js.Array(this.component, p.asInstanceOf[js.Any]))
}
