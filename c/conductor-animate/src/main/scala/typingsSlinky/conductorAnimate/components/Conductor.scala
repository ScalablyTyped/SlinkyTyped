package typingsSlinky.conductorAnimate.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.conductorAnimate.mod.Animations
import typingsSlinky.conductorAnimate.mod.ConductorProps
import typingsSlinky.conductorAnimate.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Conductor {
  @JSImport("conductor-animate", "Conductor")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConductorProps): Default[tag.type, typingsSlinky.conductorAnimate.mod.Conductor] = new Default[tag.type, typingsSlinky.conductorAnimate.mod.Conductor](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    animations: Animations,
    config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
  ): Default[tag.type, typingsSlinky.conductorAnimate.mod.Conductor] = {
    val __props = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.conductorAnimate.mod.Conductor](js.Array(this.component, __props.asInstanceOf[ConductorProps]))
  }
}

