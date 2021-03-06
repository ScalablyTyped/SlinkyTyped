package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.sketchMod.SketchPickerProps
import typingsSlinky.reactColor.sketchMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sketch {
  
  @JSImport("react-color/lib/components/sketch/Sketch", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Sketch.type): SharedBuilder_SketchPickerProps_1920055515[default] = new SharedBuilder_SketchPickerProps_1920055515[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SketchPickerProps): SharedBuilder_SketchPickerProps_1920055515[default] = new SharedBuilder_SketchPickerProps_1920055515[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
