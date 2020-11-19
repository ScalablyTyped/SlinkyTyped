package typingsSlinky.grommet.clockMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6/components/Clock", "Clock")
@js.native
class Clock protected ()
  extends Component[
      ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
      js.Object, 
      js.Any
    ] {
  def this(props: ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])) = this()
  def this(
    props: ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]),
    context: js.Any
  ) = this()
}
@JSImport("grommet/es6/components/Clock", "Clock")
@js.native
object Clock extends TopLevel[
      ReactComponentClass[
        ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])
      ]
    ]
