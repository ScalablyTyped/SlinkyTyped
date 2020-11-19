package typingsSlinky.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-kit", "MKRadioButton")
@js.native
class MKRadioButton ()
  extends MKComponent[MKRadioButtonProperties, js.Any]
@JSImport("react-native-material-kit", "MKRadioButton")
@js.native
object MKRadioButton extends js.Object {
  
  @js.native
  class Group () extends MKRadioButtonGroup {
    def this(onAdd: js.Function1[
            /* btn */ typingsSlinky.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, 
            Unit
          ]) = this()
    def this(
      onAdd: js.UndefOr[scala.Nothing],
      onRemove: js.Function1[
            /* btn */ typingsSlinky.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, 
            Unit
          ]
    ) = this()
    def this(
      onAdd: js.Function1[
            /* btn */ typingsSlinky.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, 
            Unit
          ],
      onRemove: js.Function1[
            /* btn */ typingsSlinky.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, 
            Unit
          ]
    ) = this()
    
    def add(btn: typingsSlinky.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton): Unit = js.native
    
    def onChecked(btn: typingsSlinky.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, checked: Boolean): Unit = js.native
    
    def onRemoved(btn: typingsSlinky.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton): Unit = js.native
  }
  
  @js.native
  class MKRadioButton () extends js.Object
}
