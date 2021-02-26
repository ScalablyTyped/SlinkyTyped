package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.circleMod.CirclePickerProps
import typingsSlinky.reactColor.circleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Circle {
  
  @JSImport("react-color/lib/components/circle/Circle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Circle.type): SharedBuilder_CirclePickerProps887070971[default] = new SharedBuilder_CirclePickerProps887070971[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CirclePickerProps): SharedBuilder_CirclePickerProps887070971[default] = new SharedBuilder_CirclePickerProps887070971[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
