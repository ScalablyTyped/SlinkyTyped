package typingsSlinky.reactNativeZssRichTextEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeZssRichTextEditor.anon.PartialRichTextToolbarPro
import typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS
import typingsSlinky.reactNativeZssRichTextEditor.mod.ElementStyles
import typingsSlinky.reactNativeZssRichTextEditor.mod.IconsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RichTextToolbar {
  
  @JSImport("react-native-zss-rich-text-editor", "RichTextToolbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextToolbar] {
    
    @scala.inline
    def actions(value: js.Array[ACTIONS]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionsVarargs(value: ACTIONS*): this.type = set("actions", js.Array(value :_*))
    
    @scala.inline
    def getEditor(value: () => typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextEditor): this.type = set("getEditor", js.Any.fromFunction0(value))
    
    @scala.inline
    def iconMap(value: IconsMap): this.type = set("iconMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconTint(value: String): this.type = set("iconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPressAddImage(value: () => Unit): this.type = set("onPressAddImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPressAddLink(value: () => Unit): this.type = set("onPressAddLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderAction(value: () => ReactElement): this.type = set("renderAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def selectedButtonStyle(value: ElementStyles): this.type = set("selectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedButtonStyleNull: this.type = set("selectedButtonStyle", null)
    
    @scala.inline
    def selectedIconTint(value: String): this.type = set("selectedIconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectedButtonStyle(value: ElementStyles): this.type = set("unselectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectedButtonStyleNull: this.type = set("unselectedButtonStyle", null)
  }
  
  implicit def make(companion: RichTextToolbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialRichTextToolbarPro): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
