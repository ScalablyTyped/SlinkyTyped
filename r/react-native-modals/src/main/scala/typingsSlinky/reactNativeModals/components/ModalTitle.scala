package typingsSlinky.reactNativeModals.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModals.mod.AlignTypes
import typingsSlinky.reactNativeModals.mod.ModalTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalTitle {
  
  @scala.inline
  def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ModalTitleProps]))
  }
  
  @JSImport("react-native-modals", "ModalTitle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeModals.mod.ModalTitle] {
    
    @scala.inline
    def align(value: AlignTypes): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasTitleBar(value: Boolean): this.type = set("hasTitleBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textStyleNull: this.type = set("textStyle", null)
  }
  
  def withProps(p: ModalTitleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
