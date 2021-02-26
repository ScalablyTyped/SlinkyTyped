package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.chromeMod.ChromePickerProps
import typingsSlinky.reactColor.chromeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chrome {
  
  @JSImport("react-color/lib/components/chrome/Chrome", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Chrome.type): SharedBuilder_ChromePickerProps_1493222285[default] = new SharedBuilder_ChromePickerProps_1493222285[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ChromePickerProps): SharedBuilder_ChromePickerProps_1493222285[default] = new SharedBuilder_ChromePickerProps_1493222285[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
