package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.clockMod.ClockProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.SVGProps
import typingsSlinky.std.HTMLDivElement
import typingsSlinky.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Clock")
@js.native
class Clock protected ()
  extends Component[
      ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: ClockProps with ((DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ]) | SVGProps[org.scalajs.dom.raw.SVGSVGElement])) = this()
  def this(
    props: ClockProps with ((DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ]) | SVGProps[org.scalajs.dom.raw.SVGSVGElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Clock")
@js.native
object Clock extends TopLevel[
      ComponentClass[
        ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
        ComponentState
      ]
    ]

