package typingsSlinky.antd.carouselMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carousel
  extends Component[CarouselProps, js.Object, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCarousel(prevProps: CarouselProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  
  def getDotPosition(): DotPosition = js.native
  
  def goTo(slide: Double): Unit = js.native
  def goTo(slide: Double, dontAnimate: Boolean): Unit = js.native
  
  var innerSlider: js.Any = js.native
  
  def next(): Unit = js.native
  
  def onWindowResized(): Unit = js.native
  
  def prev(): Unit = js.native
  
  def renderCarousel(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  
  def saveSlick(node: js.Any): Unit = js.native
  
  var slick: js.Any = js.native
}
