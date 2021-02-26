package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.ActionsContainer
import typingsSlinky.reactNativeMaterialUi.anon.ContentContainer
import typingsSlinky.reactNativeMaterialUi.anon.TitleContainer
import typingsSlinky.reactNativeMaterialUi.anon.`0`
import typingsSlinky.reactNativeMaterialUi.mod.DialogActionsProps
import typingsSlinky.reactNativeMaterialUi.mod.DialogContentProps
import typingsSlinky.reactNativeMaterialUi.mod.DialogProps
import typingsSlinky.reactNativeMaterialUi.mod.DialogTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dialog {
  
  @scala.inline
  def apply(children: ReactElement | js.Array[ReactElement]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogProps]))
  }
  
  object Actions {
    
    @scala.inline
    def apply(children: ReactElement): typingsSlinky.reactNativeMaterialUi.components.Dialog.Actions.Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new typingsSlinky.reactNativeMaterialUi.components.Dialog.Actions.Builder(js.Array(this.component, __props.asInstanceOf[DialogActionsProps]))
    }
    
    @JSImport("react-native-material-ui", "Dialog.Actions")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Dialog.Actions] {
      
      @scala.inline
      def style(value: ActionsContainer): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DialogActionsProps): typingsSlinky.reactNativeMaterialUi.components.Dialog.Actions.Builder = new typingsSlinky.reactNativeMaterialUi.components.Dialog.Actions.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @scala.inline
    def apply(children: ReactElement): typingsSlinky.reactNativeMaterialUi.components.Dialog.Content.Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new typingsSlinky.reactNativeMaterialUi.components.Dialog.Content.Builder(js.Array(this.component, __props.asInstanceOf[DialogContentProps]))
    }
    
    @JSImport("react-native-material-ui", "Dialog.Content")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Dialog.Content] {
      
      @scala.inline
      def style(value: ContentContainer): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DialogContentProps): typingsSlinky.reactNativeMaterialUi.components.Dialog.Content.Builder = new typingsSlinky.reactNativeMaterialUi.components.Dialog.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @scala.inline
    def apply(children: ReactElement): typingsSlinky.reactNativeMaterialUi.components.Dialog.Title.Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new typingsSlinky.reactNativeMaterialUi.components.Dialog.Title.Builder(js.Array(this.component, __props.asInstanceOf[DialogTitleProps]))
    }
    
    @JSImport("react-native-material-ui", "Dialog.Title")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Dialog.Title] {
      
      @scala.inline
      def style(value: TitleContainer): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DialogTitleProps): typingsSlinky.reactNativeMaterialUi.components.Dialog.Title.Builder = new typingsSlinky.reactNativeMaterialUi.components.Dialog.Title.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-material-ui", "Dialog")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Dialog] {
    
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: `0`): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
