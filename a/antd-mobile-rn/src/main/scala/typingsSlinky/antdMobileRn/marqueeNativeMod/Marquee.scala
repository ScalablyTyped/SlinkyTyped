package typingsSlinky.antdMobileRn.marqueeNativeMod

import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marquee
  extends Component[MarqueeProps, js.Any, js.Any] {
  
  def moveToHeader(): Unit = js.native
  
  def onLayout(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
  
  def onLayoutContainer(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
  
  def startMove(): Unit = js.native
  
  var texts: js.Any = js.native
  
  def tryStart(): Unit = js.native
  
  var twidth: Double = js.native
  
  var width: Double = js.native
}
