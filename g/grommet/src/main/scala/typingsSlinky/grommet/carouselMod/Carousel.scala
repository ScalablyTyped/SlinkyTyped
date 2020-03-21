package typingsSlinky.grommet.carouselMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Carousel", "Carousel")
@js.native
class Carousel protected ()
  extends Component[
      CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: CarouselProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ])) = this()
  def this(
    props: CarouselProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Carousel", "Carousel")
@js.native
object Carousel extends TopLevel[
      ComponentClass[
        CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

