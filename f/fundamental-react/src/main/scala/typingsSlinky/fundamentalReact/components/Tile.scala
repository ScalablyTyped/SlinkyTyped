package typingsSlinky.fundamentalReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.fundamentalReactStrings.s
import typingsSlinky.fundamentalReact.tileMod.TileContentProps
import typingsSlinky.fundamentalReact.tileMod.TileFooterProps
import typingsSlinky.fundamentalReact.tileMod.TileHeaderProps
import typingsSlinky.fundamentalReact.tileMod.TileProps
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tile {
  
  @JSImport("fundamental-react", "Tile")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDouble(value: Boolean): this.type = set("isDouble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def size(value: s): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[TileProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Tile.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Content {
    
    @JSImport("fundamental-react", "Tile.Content")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.`*`.tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def twoColumns(value: Boolean): this.type = set("twoColumns", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[TileContentProps]): typingsSlinky.fundamentalReact.components.Tile.Content.Builder = new typingsSlinky.fundamentalReact.components.Tile.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Content.type): typingsSlinky.fundamentalReact.components.Tile.Content.Builder = new typingsSlinky.fundamentalReact.components.Tile.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Footer {
    
    @JSImport("fundamental-react", "Tile.Footer")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.`*`.tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[TileFooterProps]): typingsSlinky.fundamentalReact.components.Tile.Footer.Builder = new typingsSlinky.fundamentalReact.components.Tile.Footer.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Footer.type): typingsSlinky.fundamentalReact.components.Tile.Footer.Builder = new typingsSlinky.fundamentalReact.components.Tile.Footer.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Header {
    
    @JSImport("fundamental-react", "Tile.Header")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.`*`.tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def subtitle(value: String): this.type = set("subtitle", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[TileHeaderProps]): typingsSlinky.fundamentalReact.components.Tile.Header.Builder = new typingsSlinky.fundamentalReact.components.Tile.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Header.type): typingsSlinky.fundamentalReact.components.Tile.Header.Builder = new typingsSlinky.fundamentalReact.components.Tile.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
}
