package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`2`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`3`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`4`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`5`
import typingsSlinky.fundamentalReact.fundamentalReactNumbers.`6`
import typingsSlinky.fundamentalReact.tileMod.TileActionsProps
import typingsSlinky.fundamentalReact.tileMod.TileContentProps
import typingsSlinky.fundamentalReact.tileMod.TileMediaProps
import typingsSlinky.fundamentalReact.tileMod.TileProps
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tile {
  @JSImport("fundamental-react", "Tile")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundImage(value: String): this.type = set("backgroundImage", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* repeated */ js.Any => _): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def productTile(value: Boolean): this.type = set("productTile", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[TileProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tile.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Actions {
    @JSImport("fundamental-react", "Tile.Actions")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[TileActionsProps]): typingsSlinky.fundamentalReact.components.Tile.Actions.Builder = new typingsSlinky.fundamentalReact.components.Tile.Actions.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Actions.type): typingsSlinky.fundamentalReact.components.Tile.Actions.Builder = new typingsSlinky.fundamentalReact.components.Tile.Actions.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Content {
    @JSImport("fundamental-react", "Tile.Content")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def headingLevel(value: `2` | `3` | `4` | `5` | `6`): this.type = set("headingLevel", value.asInstanceOf[js.Any])
      @scala.inline
      def productTile(value: Boolean): this.type = set("productTile", value.asInstanceOf[js.Any])
      @scala.inline
      def titleProps(value: js.Any): this.type = set("titleProps", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[TileContentProps]): typingsSlinky.fundamentalReact.components.Tile.Content.Builder = new typingsSlinky.fundamentalReact.components.Tile.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(title: String): typingsSlinky.fundamentalReact.components.Tile.Content.Builder = {
        val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        new typingsSlinky.fundamentalReact.components.Tile.Content.Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[TileContentProps]]))
    }
  }
  
  object Media {
    @JSImport("fundamental-react", "Tile.Media")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def productTile(value: Boolean): this.type = set("productTile", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildren[TileMediaProps]): typingsSlinky.fundamentalReact.components.Tile.Media.Builder = new typingsSlinky.fundamentalReact.components.Tile.Media.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Media.type): typingsSlinky.fundamentalReact.components.Tile.Media.Builder = new typingsSlinky.fundamentalReact.components.Tile.Media.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

