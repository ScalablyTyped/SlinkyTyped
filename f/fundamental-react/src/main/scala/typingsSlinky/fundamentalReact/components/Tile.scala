package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.tileMod.TileProps
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tile {
  @JSImport("fundamental-react/lib/Tile/Tile", JSImport.Default)
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
}

