package typingsSlinky.reactOnsenui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameCalculateItemHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyList {
  @JSImport("react-onsenui", "LazyList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.LazyList] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassNameCalculateItemHeight): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(calculateItemHeight: Double => js.Any, renderRow: Double => js.Any): Builder = {
    val __props = js.Dynamic.literal(calculateItemHeight = js.Any.fromFunction1(calculateItemHeight), renderRow = js.Any.fromFunction1(renderRow))
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassNameCalculateItemHeight]))
  }
}

