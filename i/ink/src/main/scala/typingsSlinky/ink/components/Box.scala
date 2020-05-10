package typingsSlinky.ink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ink.inkStrings.`column-reverse`
import typingsSlinky.ink.inkStrings.`flex-end`
import typingsSlinky.ink.inkStrings.`flex-start`
import typingsSlinky.ink.inkStrings.`row-reverse`
import typingsSlinky.ink.inkStrings.`space-around`
import typingsSlinky.ink.inkStrings.`space-between`
import typingsSlinky.ink.inkStrings.`truncate-end`
import typingsSlinky.ink.inkStrings.`truncate-middle`
import typingsSlinky.ink.inkStrings.`truncate-start`
import typingsSlinky.ink.inkStrings.center
import typingsSlinky.ink.inkStrings.column
import typingsSlinky.ink.inkStrings.row
import typingsSlinky.ink.inkStrings.truncate
import typingsSlinky.ink.inkStrings.wrap
import typingsSlinky.ink.mod.BoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Box {
  @JSImport("ink", "Box")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.ink.mod.Box] {
    @scala.inline
    def alignItems(value: `flex-start` | center | `flex-end`): this.type = set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def flexBasis(value: String | Double): this.type = set("flexBasis", value.asInstanceOf[js.Any])
    @scala.inline
    def flexDirection(value: row | `row-reverse` | column | `column-reverse`): this.type = set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def flexGrow(value: Double): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    @scala.inline
    def flexShrink(value: Double): this.type = set("flexShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def justifyContent(value: `flex-start` | center | `flex-end` | `space-between` | `space-around`): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Double): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def marginBottom(value: Double): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def marginLeft(value: Double): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def marginRight(value: Double): this.type = set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def marginTop(value: Double): this.type = set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def marginX(value: Double): this.type = set("marginX", value.asInstanceOf[js.Any])
    @scala.inline
    def marginY(value: Double): this.type = set("marginY", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingBottom(value: Double): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingLeft(value: Double): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingRight(value: Double): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingTop(value: Double): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingX(value: Double): this.type = set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingY(value: Double): this.type = set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def textWrap(value: wrap | truncate | `truncate-start` | `truncate-middle` | `truncate-end`): this.type = set("textWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Box.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

