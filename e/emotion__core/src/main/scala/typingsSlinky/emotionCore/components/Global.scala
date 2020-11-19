package typingsSlinky.emotionCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emotionCore.mod.GlobalProps
import typingsSlinky.emotionCore.mod.InterpolationWithTheme
import typingsSlinky.emotionSerialize.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Global {
  
  @JSImport("@emotion/core", "Global")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[Theme] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def stylesFunction1(value: Theme => Interpolation[js.UndefOr[scala.Nothing]]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def styles(value: InterpolationWithTheme[Theme]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesNull: this.type = set("styles", null)
  }
  
  def withProps[Theme](p: GlobalProps[Theme]): Builder[Theme] = new Builder[Theme](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[Theme](): Builder[Theme] = {
    val __props = js.Dynamic.literal()
    new Builder[Theme](js.Array(this.component, __props.asInstanceOf[GlobalProps[Theme]]))
  }
  
  implicit def make[Theme](companion: Global.type): Builder[Theme] = new Builder[Theme](js.Array(this.component, js.Dictionary.empty))()
}
