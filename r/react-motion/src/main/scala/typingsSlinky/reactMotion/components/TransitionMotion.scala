package typingsSlinky.reactMotion.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMotion.mod.InterpolateFunction
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.Style
import typingsSlinky.reactMotion.mod.TransitionPlainStyle
import typingsSlinky.reactMotion.mod.TransitionProps
import typingsSlinky.reactMotion.mod.TransitionStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransitionMotion {
  
  @JSImport("react-motion", "TransitionMotion")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMotion.mod.TransitionMotion] {
    
    @scala.inline
    def children(value: /* interpolatedStyles */ js.Array[TransitionPlainStyle] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def defaultStylesVarargs(value: TransitionPlainStyle*): this.type = set("defaultStyles", js.Array(value :_*))
    
    @scala.inline
    def defaultStyles(value: js.Array[TransitionPlainStyle]): this.type = set("defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def didLeave(value: /* styleThatLeft */ TransitionStyle => Unit): this.type = set("didLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def willEnter(value: /* styleThatEntered */ TransitionStyle => PlainStyle): this.type = set("willEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def willLeave(value: /* styleThatLeft */ TransitionStyle => Style | Unit): this.type = set("willLeave", js.Any.fromFunction1(value))
  }
  
  def withProps(p: TransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(styles: js.Array[TransitionStyle] | InterpolateFunction): Builder = {
    val __props = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TransitionProps]))
  }
}
