package typingsSlinky.reactFlexr.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFlexr.ReactFlexr.GridProps
import typingsSlinky.reactFlexr.reactFlexrStrings.bottom
import typingsSlinky.reactFlexr.reactFlexrStrings.center
import typingsSlinky.reactFlexr.reactFlexrStrings.left
import typingsSlinky.reactFlexr.reactFlexrStrings.right
import typingsSlinky.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  @JSImport("react-flexr", "Grid")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFlexr.mod.Grid] {
    @scala.inline
    def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def flexCells(value: Boolean): this.type = set("flexCells", value.asInstanceOf[js.Any])
    @scala.inline
    def gutter(value: String): this.type = set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def hAlign(value: left | center | right): this.type = set("hAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Grid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

