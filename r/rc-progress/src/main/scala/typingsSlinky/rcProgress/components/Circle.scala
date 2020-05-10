package typingsSlinky.rcProgress.components

import typingsSlinky.rcProgress.mod.RCProgressProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Circle {
  @JSImport("rc-progress", "Circle")
  @js.native
  object component extends js.Object
  
  def withProps(p: RCProgressProps): SharedBuilder_RCProgressProps89681719[typingsSlinky.rcProgress.mod.Circle] = new SharedBuilder_RCProgressProps89681719[typingsSlinky.rcProgress.mod.Circle](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Circle.type): SharedBuilder_RCProgressProps89681719[typingsSlinky.rcProgress.mod.Circle] = new SharedBuilder_RCProgressProps89681719[typingsSlinky.rcProgress.mod.Circle](js.Array(this.component, js.Dictionary.empty))()
}

