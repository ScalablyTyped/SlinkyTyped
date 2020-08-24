package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`1`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`2`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`3`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`4`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`5`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`6`
import typingsSlinky.fundamentalReact.panelMod.PanelActionsProps
import typingsSlinky.fundamentalReact.panelMod.PanelBodyProps
import typingsSlinky.fundamentalReact.panelMod.PanelFiltersProps
import typingsSlinky.fundamentalReact.panelMod.PanelFooterProps
import typingsSlinky.fundamentalReact.panelMod.PanelHeadProps
import typingsSlinky.fundamentalReact.panelMod.PanelHeaderProps
import typingsSlinky.fundamentalReact.panelMod.PanelProps
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Panel {
  @JSImport("fundamental-react", "Panel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def colSpan(value: `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[PanelProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Panel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Actions {
    @JSImport("fundamental-react", "Panel.Actions")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[PanelActionsProps]): typingsSlinky.fundamentalReact.components.Panel.Actions.Builder = new typingsSlinky.fundamentalReact.components.Panel.Actions.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Actions.type): typingsSlinky.fundamentalReact.components.Panel.Actions.Builder = new typingsSlinky.fundamentalReact.components.Panel.Actions.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Body {
    @JSImport("fundamental-react", "Panel.Body")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[PanelBodyProps]): typingsSlinky.fundamentalReact.components.Panel.Body.Builder = new typingsSlinky.fundamentalReact.components.Panel.Body.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Body.type): typingsSlinky.fundamentalReact.components.Panel.Body.Builder = new typingsSlinky.fundamentalReact.components.Panel.Body.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Filters {
    @JSImport("fundamental-react", "Panel.Filters")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[PanelFiltersProps]): typingsSlinky.fundamentalReact.components.Panel.Filters.Builder = new typingsSlinky.fundamentalReact.components.Panel.Filters.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Filters.type): typingsSlinky.fundamentalReact.components.Panel.Filters.Builder = new typingsSlinky.fundamentalReact.components.Panel.Filters.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Footer {
    @JSImport("fundamental-react", "Panel.Footer")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[PanelFooterProps]): typingsSlinky.fundamentalReact.components.Panel.Footer.Builder = new typingsSlinky.fundamentalReact.components.Panel.Footer.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Footer.type): typingsSlinky.fundamentalReact.components.Panel.Footer.Builder = new typingsSlinky.fundamentalReact.components.Panel.Footer.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Header {
    @JSImport("fundamental-react", "Panel.Header")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[PanelHeaderProps]): typingsSlinky.fundamentalReact.components.Panel.Header.Builder = new typingsSlinky.fundamentalReact.components.Panel.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Header.type): typingsSlinky.fundamentalReact.components.Panel.Header.Builder = new typingsSlinky.fundamentalReact.components.Panel.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Head {
    @JSImport("fundamental-react", "Panel.Head")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
      @scala.inline
      def headingLevel(value: `2` | `3` | `4` | `5` | `6`): this.type = set("headingLevel", value.asInstanceOf[js.Any])
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[PanelHeadProps]): typingsSlinky.fundamentalReact.components.Panel.Head.Builder = new typingsSlinky.fundamentalReact.components.Panel.Head.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Head.type): typingsSlinky.fundamentalReact.components.Panel.Head.Builder = new typingsSlinky.fundamentalReact.components.Panel.Head.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

