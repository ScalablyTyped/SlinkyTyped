package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.hueHueMod.HuePickerProps
import typingsSlinky.reactColor.hueHueMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hue {
  @JSImport("react-color/lib/components/hue/Hue", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: HuePickerProps): SharedBuilder_HuePickerProps_222923074[default] = new SharedBuilder_HuePickerProps_222923074[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Hue.type): SharedBuilder_HuePickerProps_222923074[default] = new SharedBuilder_HuePickerProps_222923074[default](js.Array(this.component, js.Dictionary.empty))()
}

