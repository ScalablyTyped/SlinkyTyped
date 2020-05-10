package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.sketchMod.SketchPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SketchPicker {
  @JSImport("react-color", "SketchPicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: SketchPickerProps): SharedBuilder_SketchPickerProps_1920055515[typingsSlinky.reactColor.mod.SketchPicker] = new SharedBuilder_SketchPickerProps_1920055515[typingsSlinky.reactColor.mod.SketchPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SketchPicker.type): SharedBuilder_SketchPickerProps_1920055515[typingsSlinky.reactColor.mod.SketchPicker] = new SharedBuilder_SketchPickerProps_1920055515[typingsSlinky.reactColor.mod.SketchPicker](js.Array(this.component, js.Dictionary.empty))()
}

