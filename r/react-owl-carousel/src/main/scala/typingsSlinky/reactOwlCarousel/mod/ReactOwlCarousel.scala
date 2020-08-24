package typingsSlinky.reactOwlCarousel.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.react.mod.Component
import typingsSlinky.reactOwlCarousel.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactOwlCarousel
  extends Component[OwlCarouselProps, js.Object, js.Any] {
  @JSName("$ele")
  var $ele: js.UndefOr[JQuery[HTMLElement]] = js.native
  var container: js.Any = js.native
  var containerRef: js.Any = js.native
  var options: js.Any = js.native
  var propsWithoutOptions: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactOwlCarousel(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactOwlCarousel(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MReactOwlCarousel(): Unit = js.native
  def create(): Unit = js.native
  def create(options: Options): Unit = js.native
  def destory(): Unit = js.native
  def next(speed: js.Array[Double]): Unit = js.native
  def next(speed: Double): Unit = js.native
  def play(timeout: Double, speed: Double): Unit = js.native
  def prev(speed: js.Array[Double]): Unit = js.native
  def prev(speed: Double): Unit = js.native
  def stop(): Unit = js.native
  def to(position: Double, speed: Double): Unit = js.native
}

