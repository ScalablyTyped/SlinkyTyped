package typingsSlinky.reactDashSvg.reactDashSvgMod

import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.reactDashSvg.Anon_HasError
import typingsSlinky.std.HTMLDivElement
import typingsSlinky.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSVG
  extends Component[
      Props with (DetailedHTMLProps[HTMLAttributes[WrapperType], WrapperType]), 
      State, 
      js.Any
    ] {
  var _isMounted: Boolean = js.native
  var container: js.UndefOr[WrapperType | Null] = js.native
  var initialState: Anon_HasError = js.native
  @JSName("state")
  var state_ReactSVG: Anon_HasError = js.native
  var svgWrapper: js.UndefOr[WrapperType | Null] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactSVG(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactSVG(prevProps: Props): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactSVG(): Unit = js.native
  def refCallback(): Unit = js.native
  def refCallback(container: HTMLDivElement): Unit = js.native
  def refCallback(container: HTMLSpanElement): Unit = js.native
  def removeSVG(): Unit = js.native
  def renderSVG(): Unit = js.native
}

