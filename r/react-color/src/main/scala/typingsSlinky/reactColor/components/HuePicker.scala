package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.hueHueMod.HuePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HuePicker {
  @JSImport("react-color", "HuePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: HuePickerProps): SharedBuilder_HuePickerProps_222923074[typingsSlinky.reactColor.mod.HuePicker] = new SharedBuilder_HuePickerProps_222923074[typingsSlinky.reactColor.mod.HuePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HuePicker.type): SharedBuilder_HuePickerProps_222923074[typingsSlinky.reactColor.mod.HuePicker] = new SharedBuilder_HuePickerProps_222923074[typingsSlinky.reactColor.mod.HuePicker](js.Array(this.component, js.Dictionary.empty))()
}

