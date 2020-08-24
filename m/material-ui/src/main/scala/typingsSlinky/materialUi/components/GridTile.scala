package typingsSlinky.materialUi.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.GridList.GridTileProps
import typingsSlinky.materialUi.materialUiStrings.bottom
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.materialUi.materialUiStrings.top
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GridTile {
  @JSImport("material-ui", "GridTile")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.GridTile] {
    @scala.inline
    def actionIcon(value: ReactElement): this.type = set("actionIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def actionPosition(value: left | right): this.type = set("actionPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def containerElementReactElement(value: ReactElement): this.type = set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def containerElementComponentClass(value: ReactComponentClass[_]): this.type = set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def containerElement(value: String | ReactElement | ReactComponentClass[_]): this.type = set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[js.Object] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitleReactElement(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitle(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitleStyle(value: CSSProperties): this.type = set("subtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleBackground(value: String): this.type = set("titleBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def titlePosition(value: top | bottom): this.type = set("titlePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GridTileProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GridTile.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

