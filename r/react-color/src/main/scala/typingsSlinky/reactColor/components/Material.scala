package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.materialMod.MaterialPickerProps
import typingsSlinky.reactColor.materialMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Material {
  
  @JSImport("react-color/lib/components/material/Material", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Material.type): SharedBuilder_MaterialPickerProps_1955371684[default] = new SharedBuilder_MaterialPickerProps_1955371684[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MaterialPickerProps): SharedBuilder_MaterialPickerProps_1955371684[default] = new SharedBuilder_MaterialPickerProps_1955371684[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
