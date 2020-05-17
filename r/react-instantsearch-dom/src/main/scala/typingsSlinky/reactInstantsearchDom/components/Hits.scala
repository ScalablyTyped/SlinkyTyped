package typingsSlinky.reactInstantsearchDom.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInstantsearchDom.anon.Hit
import typingsSlinky.reactInstantsearchDom.mod.HitsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hits {
  @JSImport("react-instantsearch-dom", "Hits")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactInstantsearchDom.mod.Hits[js.Any]] {
    @scala.inline
    def hitComponentFunctionComponent(value: ReactComponentClass[Hit[T]]): this.type = set("hitComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def hitComponentComponentClass(value: ReactComponentClass[Hit[T]]): this.type = set("hitComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def hitComponent(value: ReactComponentClass[Hit[T]]): this.type = set("hitComponent", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: HitsProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Hits.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

