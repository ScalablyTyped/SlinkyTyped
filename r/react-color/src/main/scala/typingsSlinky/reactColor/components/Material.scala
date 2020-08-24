package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.materialMod.MaterialPickerProps
import typingsSlinky.reactColor.materialMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Material {
  @JSImport("react-color/lib/components/material/Material", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: MaterialPickerProps): SharedBuilder_MaterialPickerProps_1955371684[default] = new SharedBuilder_MaterialPickerProps_1955371684[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Material.type): SharedBuilder_MaterialPickerProps_1955371684[default] = new SharedBuilder_MaterialPickerProps_1955371684[default](js.Array(this.component, js.Dictionary.empty))()
}

