package typingsSlinky.reactOnsenui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.anon.DataSource
import typingsSlinky.reactOnsenui.anon.HTMLAttributesidclassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("react-onsenui", "List")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.List[T]] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def dataSourceVarargs(value: T*): this.type = set("dataSource", js.Array(value :_*))
    @scala.inline
    def dataSource(value: js.Array[T]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def renderFooter(value: () => js.UndefOr[ReactElement]): this.type = set("renderFooter", js.Any.fromFunction0(value))
    @scala.inline
    def renderHeader(value: () => js.UndefOr[ReactElement]): this.type = set("renderHeader", js.Any.fromFunction0(value))
    @scala.inline
    def renderRow(value: (T, /* index */ js.UndefOr[Double]) => js.UndefOr[ReactElement]): this.type = set("renderRow", js.Any.fromFunction2(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: HTMLAttributesidclassName with DataSource[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassName with DataSource[T]]))
  }
  implicit def make[T](companion: List.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

