package typingsSlinky.rcProgress.components

import typingsSlinky.rcProgress.interfaceMod.ProgressProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Line {
  
  @JSImport("rc-progress", "Line")
  @js.native
  object component extends js.Object
  
  def withProps(p: ProgressProps): SharedBuilder_ProgressProps_555392113 = new SharedBuilder_ProgressProps_555392113(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Line.type): SharedBuilder_ProgressProps_555392113 = new SharedBuilder_ProgressProps_555392113(js.Array(this.component, js.Dictionary.empty))()
}
