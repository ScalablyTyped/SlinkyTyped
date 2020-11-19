package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.compactMod.CompactPickerProps
import typingsSlinky.reactColor.compactMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Compact {
  
  @JSImport("react-color/lib/components/compact/Compact", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CompactPickerProps): SharedBuilder_CompactPickerProps1757301980[default] = new SharedBuilder_CompactPickerProps1757301980[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Compact.type): SharedBuilder_CompactPickerProps1757301980[default] = new SharedBuilder_CompactPickerProps1757301980[default](js.Array(this.component, js.Dictionary.empty))()
}
