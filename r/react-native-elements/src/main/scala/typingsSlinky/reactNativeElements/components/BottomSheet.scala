package typingsSlinky.reactNativeElements.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNative.mod.ModalProps
import typingsSlinky.reactNativeElements.mod.BottomSheetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BottomSheet {
  
  @scala.inline
  def apply(isVisible: Boolean, modalProps: ModalProps): Default[tag.type, typingsSlinky.reactNativeElements.mod.BottomSheet] = {
    val __props = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], modalProps = modalProps.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNativeElements.mod.BottomSheet](js.Array(this.component, __props.asInstanceOf[BottomSheetProps]))
  }
  
  @JSImport("react-native-elements", "BottomSheet")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BottomSheetProps): Default[tag.type, typingsSlinky.reactNativeElements.mod.BottomSheet] = new Default[tag.type, typingsSlinky.reactNativeElements.mod.BottomSheet](js.Array(this.component, p.asInstanceOf[js.Any]))
}
