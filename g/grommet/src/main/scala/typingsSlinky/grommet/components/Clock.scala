package typingsSlinky.grommet.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.clockMod.ClockProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Support for combinations of intersection and union types not implemented */
object Clock
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommet.mod.Clock] {
  @JSImport("grommet", "Clock")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])
}

