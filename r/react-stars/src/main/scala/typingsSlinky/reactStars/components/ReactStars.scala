package typingsSlinky.reactStars.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactStars.mod.ReactStarsProps
import typingsSlinky.reactStars.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactStars {
  
  @JSImport("react-stars", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def char(value: String): this.type = set("char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color1(value: String): this.type = set("color1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color2(value: String): this.type = set("color2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def edit(value: Boolean): this.type = set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def half(value: Boolean): this.type = set("half", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* new_rating */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactStars.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactStarsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
