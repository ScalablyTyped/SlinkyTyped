package typingsSlinky.emojiMart

import typingsSlinky.emojiMart.categoryMod.Props
import typingsSlinky.emojiMart.nimblePickerMod.NimblePickerProps
import typingsSlinky.emojiMart.sharedPropsMod.PickerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("emoji-mart/dist-es/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  
  @js.native
  class Category ()
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class NimblePicker ()
    extends Component[NimblePickerProps, js.Object, js.Any]
  
  @js.native
  class Picker ()
    extends Component[PickerProps, js.Object, js.Any]
}
