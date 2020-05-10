package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.alphaMod.AlphaPickerProps
import typingsSlinky.reactColor.alphaMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alpha {
  @JSImport("react-color/lib/components/alpha/Alpha", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: AlphaPickerProps): SharedBuilder_AlphaPickerProps1179989143[default] = new SharedBuilder_AlphaPickerProps1179989143[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Alpha.type): SharedBuilder_AlphaPickerProps1179989143[default] = new SharedBuilder_AlphaPickerProps1179989143[default](js.Array(this.component, js.Dictionary.empty))()
}

