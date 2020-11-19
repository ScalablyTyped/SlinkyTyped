package typingsSlinky.conductorAnimate.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.conductorAnimate.mod.Animations
import typingsSlinky.conductorAnimate.mod.ConductorProps
import typingsSlinky.conductorAnimate.mod.Config
import typingsSlinky.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Conductor {
  
  @JSImport("conductor-animate", "Conductor")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.conductorAnimate.mod.Conductor] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: ReactElement | ReactNodeArray): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConductorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    animations: Animations,
    config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
  ): Builder = {
    val __props = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ConductorProps]))
  }
}
