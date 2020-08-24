package typingsSlinky.grommet.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.SVGSVGElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.grommet.clockMod.ClockProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Clock {
  @JSImport("grommet/es6", "Clock")
  @js.native
  object component extends js.Object
  
  def apply(
    p: ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])
  ): Default[tag.type, typingsSlinky.grommet.mod.Clock] = new Default[tag.type, typingsSlinky.grommet.mod.Clock](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Clock.type): Default[tag.type, typingsSlinky.grommet.mod.Clock] = new Default[tag.type, typingsSlinky.grommet.mod.Clock](js.Array(this.component, js.Dictionary.empty))()
}

