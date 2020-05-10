package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.circleMod.CirclePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CirclePicker {
  @JSImport("react-color", "CirclePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: CirclePickerProps): SharedBuilder_CirclePickerProps887070971[typingsSlinky.reactColor.mod.CirclePicker] = new SharedBuilder_CirclePickerProps887070971[typingsSlinky.reactColor.mod.CirclePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CirclePicker.type): SharedBuilder_CirclePickerProps887070971[typingsSlinky.reactColor.mod.CirclePicker] = new SharedBuilder_CirclePickerProps887070971[typingsSlinky.reactColor.mod.CirclePicker](js.Array(this.component, js.Dictionary.empty))()
}

