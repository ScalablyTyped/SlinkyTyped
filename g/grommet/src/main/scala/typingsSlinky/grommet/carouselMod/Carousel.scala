package typingsSlinky.grommet.carouselMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Carousel", "Carousel")
@js.native
class Carousel protected ()
  extends Component[
      CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      js.Object, 
      js.Any
    ] {
  def this(props: CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
  def this(
    props: CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Carousel", "Carousel")
@js.native
object Carousel extends TopLevel[
      ReactComponentClass[
        CarouselProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
      ]
    ]

