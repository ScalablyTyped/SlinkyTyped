package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.ValueNumber
import typingsSlinky.primereact.ratingMod.RatingProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rating {
  @JSImport("primereact/rating", "Rating")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactRatingMod.Rating] {
    @scala.inline
    def cancel(value: Boolean): this.type = set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* e */ ValueNumber => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def stars(value: Double): this.type = set("stars", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Rating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

