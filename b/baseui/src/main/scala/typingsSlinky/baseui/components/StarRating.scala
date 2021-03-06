package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.ValueNumber
import typingsSlinky.baseui.ratingMod.RatingOverrides
import typingsSlinky.baseui.ratingMod.StarRatingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StarRating {
  
  @JSImport("baseui/rating", "StarRating")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.ratingMod.StarRating] {
    
    @scala.inline
    def numItems(value: Double): this.type = set("numItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* args */ ValueNumber => _): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: RatingOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StarRating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StarRatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
