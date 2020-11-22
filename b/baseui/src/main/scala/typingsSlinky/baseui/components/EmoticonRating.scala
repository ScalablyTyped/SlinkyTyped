package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.ValueNumber
import typingsSlinky.baseui.ratingMod.EmoticonRatingProps
import typingsSlinky.baseui.ratingMod.RatingOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EmoticonRating {
  
  @JSImport("baseui/rating", "EmoticonRating")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.ratingMod.EmoticonRating] {
    
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
  
  def withProps(p: EmoticonRatingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: EmoticonRating.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
