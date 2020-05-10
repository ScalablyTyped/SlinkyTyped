package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.circleMod.CirclePickerProps
import typingsSlinky.reactColor.circleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Circle {
  @JSImport("react-color/lib/components/circle/Circle", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CirclePickerProps): SharedBuilder_CirclePickerProps887070971[default] = new SharedBuilder_CirclePickerProps887070971[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Circle.type): SharedBuilder_CirclePickerProps887070971[default] = new SharedBuilder_CirclePickerProps887070971[default](js.Array(this.component, js.Dictionary.empty))()
}

