package typingsSlinky.rcProgress.components

import typingsSlinky.rcProgress.mod.RCProgressProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Line {
  @JSImport("rc-progress", "Line")
  @js.native
  object component extends js.Object
  
  def withProps(p: RCProgressProps): SharedBuilder_RCProgressProps89681719[typingsSlinky.rcProgress.mod.Line] = new SharedBuilder_RCProgressProps89681719[typingsSlinky.rcProgress.mod.Line](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Line.type): SharedBuilder_RCProgressProps89681719[typingsSlinky.rcProgress.mod.Line] = new SharedBuilder_RCProgressProps89681719[typingsSlinky.rcProgress.mod.Line](js.Array(this.component, js.Dictionary.empty))()
}

