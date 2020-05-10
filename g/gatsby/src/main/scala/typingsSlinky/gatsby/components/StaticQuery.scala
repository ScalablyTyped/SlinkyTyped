package typingsSlinky.gatsby.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gatsby.mod.StaticQueryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticQuery {
  @JSImport("gatsby", "StaticQuery")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gatsby.mod.StaticQuery[js.Any]] {
    @scala.inline
    def render(value: T => TagMod[Any]): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps[T](p: StaticQueryProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](query: js.Any): Builder[T] = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[StaticQueryProps[T]]))
  }
}

