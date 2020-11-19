package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Image
import typingsSlinky.reactNativeMaterialUi.anon.AccountContainer
import typingsSlinky.reactNativeMaterialUi.anon.ContainerContentContainer
import typingsSlinky.reactNativeMaterialUi.anon.Item
import typingsSlinky.reactNativeMaterialUi.anon.`0`
import typingsSlinky.reactNativeMaterialUi.mod.DrawerHeaderAccountProps
import typingsSlinky.reactNativeMaterialUi.mod.DrawerHeaderProps
import typingsSlinky.reactNativeMaterialUi.mod.DrawerProps
import typingsSlinky.reactNativeMaterialUi.mod.DrawerSectionItem
import typingsSlinky.reactNativeMaterialUi.mod.DrawerSectionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  @JSImport("react-native-material-ui", "Drawer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Drawer] {
    
    @scala.inline
    def style(value: `0`): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DrawerProps]))
  }
  
  object Header {
    
    @JSImport("react-native-material-ui", "Drawer.Header")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Drawer.Header] {
      
      @scala.inline
      def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def children(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def imageVarargs(value: Image*): this.type = set("image", js.Array(value :_*))
      
      @scala.inline
      def image(value: js.Array[Image]): this.type = set("image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: ContainerContentContainer): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DrawerHeaderProps): typingsSlinky.reactNativeMaterialUi.components.Drawer.Header.Builder = new typingsSlinky.reactNativeMaterialUi.components.Drawer.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Header.type): typingsSlinky.reactNativeMaterialUi.components.Drawer.Header.Builder = new typingsSlinky.reactNativeMaterialUi.components.Drawer.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    object Account {
      
      @JSImport("react-native-material-ui", "Drawer.Header.Account")
      @js.native
      object component extends js.Object
      
      @scala.inline
      class Builder (val args: js.Array[js.Any])
        extends AnyVal
           with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Drawer.Header.Account] {
        
        @scala.inline
        def accountsVarargs(value: typingsSlinky.reactNativeMaterialUi.anon.Avatar*): this.type = set("accounts", js.Array(value :_*))
        
        @scala.inline
        def accounts(value: js.Array[typingsSlinky.reactNativeMaterialUi.anon.Avatar]): this.type = set("accounts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def avatar(value: ReactElement): this.type = set("avatar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def footer(value: js.Object): this.type = set("footer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def style(value: AccountContainer): this.type = set("style", value.asInstanceOf[js.Any])
      }
      
      def withProps(p: DrawerHeaderAccountProps): typingsSlinky.reactNativeMaterialUi.components.Drawer.Header.Account.Builder = new typingsSlinky.reactNativeMaterialUi.components.Drawer.Header.Account.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
      
      implicit def make(companion: Account.type): typingsSlinky.reactNativeMaterialUi.components.Drawer.Header.Account.Builder = new typingsSlinky.reactNativeMaterialUi.components.Drawer.Header.Account.Builder(js.Array(this.component, js.Dictionary.empty))()
    }
  }
  
  object Section {
    
    @JSImport("react-native-material-ui", "Drawer.Section")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Drawer.Section] {
      
      @scala.inline
      def divider(value: Boolean): this.type = set("divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: Item): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DrawerSectionProps): typingsSlinky.reactNativeMaterialUi.components.Drawer.Section.Builder = new typingsSlinky.reactNativeMaterialUi.components.Drawer.Section.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(items: js.Array[DrawerSectionItem]): typingsSlinky.reactNativeMaterialUi.components.Drawer.Section.Builder = {
      val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      new typingsSlinky.reactNativeMaterialUi.components.Drawer.Section.Builder(js.Array(this.component, __props.asInstanceOf[DrawerSectionProps]))
    }
  }
}
