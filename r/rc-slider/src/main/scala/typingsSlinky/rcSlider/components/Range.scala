package typingsSlinky.rcSlider.components

import typingsSlinky.rcSlider.rangeMod.RangeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  @JSImport("rc-slider", "Range")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Range.type): SharedBuilder_RangeProps_652309511[typingsSlinky.rcSlider.mod.Range] = new SharedBuilder_RangeProps_652309511[typingsSlinky.rcSlider.mod.Range](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RangeProps): SharedBuilder_RangeProps_652309511[typingsSlinky.rcSlider.mod.Range] = new SharedBuilder_RangeProps_652309511[typingsSlinky.rcSlider.mod.Range](js.Array(this.component, p.asInstanceOf[js.Any]))
}
