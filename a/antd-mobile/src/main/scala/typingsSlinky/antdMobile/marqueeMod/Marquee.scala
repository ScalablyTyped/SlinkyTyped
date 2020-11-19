package typingsSlinky.antdMobile.marqueeMod

import typingsSlinky.antdMobile.anon.AnimatedWidth
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marquee
  extends Component[MarqueeProps, js.Any, js.Any] {
  
  var _marqueeTimer: js.Any = js.native
  
  def _measureText(): Unit = js.native
  
  def _startAnimation(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MMarquee(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMarquee(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MMarquee(): Unit = js.native
  
  @JSName("state")
  var state_Marquee: AnimatedWidth = js.native
  
  var textRef: js.Any = js.native
}
