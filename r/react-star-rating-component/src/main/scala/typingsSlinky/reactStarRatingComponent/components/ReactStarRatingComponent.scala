package typingsSlinky.reactStarRatingComponent.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactStarRatingComponent.mod.StarRatingComponentProps
import typingsSlinky.reactStarRatingComponent.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactStarRatingComponent {
  @JSImport("react-star-rating-component", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def editing(value: Boolean): this.type = set("editing", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyStarColor(value: String): this.type = set("emptyStarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def onStarClick(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): this.type = set("onStarClick", js.Any.fromFunction3(value))
    @scala.inline
    def onStarHover(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): this.type = set("onStarHover", js.Any.fromFunction3(value))
    @scala.inline
    def onStarHoverOut(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): this.type = set("onStarHoverOut", js.Any.fromFunction3(value))
    @scala.inline
    def renderStarIcon(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => TagMod[Any] | String): this.type = set("renderStarIcon", js.Any.fromFunction3(value))
    @scala.inline
    def renderStarIconHalf(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => TagMod[Any] | String): this.type = set("renderStarIconHalf", js.Any.fromFunction3(value))
    @scala.inline
    def starColor(value: String): this.type = set("starColor", value.asInstanceOf[js.Any])
    @scala.inline
    def starCount(value: Double): this.type = set("starCount", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StarRatingComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String, value: Double): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StarRatingComponentProps]))
  }
}

