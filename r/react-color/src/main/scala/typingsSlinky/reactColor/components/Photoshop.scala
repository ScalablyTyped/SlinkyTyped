package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.photoshopMod.PhotoshopPickerProps
import typingsSlinky.reactColor.photoshopMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Photoshop {
  @JSImport("react-color/lib/components/photoshop/Photoshop", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PhotoshopPickerProps): SharedBuilder_PhotoshopPickerProps1797101677[default] = new SharedBuilder_PhotoshopPickerProps1797101677[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Photoshop.type): SharedBuilder_PhotoshopPickerProps1797101677[default] = new SharedBuilder_PhotoshopPickerProps1797101677[default](js.Array(this.component, js.Dictionary.empty))()
}

