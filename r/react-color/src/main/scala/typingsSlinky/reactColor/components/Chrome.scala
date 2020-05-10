package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.chromeMod.ChromePickerProps
import typingsSlinky.reactColor.chromeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Chrome {
  @JSImport("react-color/lib/components/chrome/Chrome", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ChromePickerProps): SharedBuilder_ChromePickerProps_1493222285[default] = new SharedBuilder_ChromePickerProps_1493222285[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Chrome.type): SharedBuilder_ChromePickerProps_1493222285[default] = new SharedBuilder_ChromePickerProps_1493222285[default](js.Array(this.component, js.Dictionary.empty))()
}

