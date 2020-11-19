package typingsSlinky.antdMobileRn.marqueeNativeMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marquee
  extends Component[MarqueeProps, js.Any, js.Any] {
  
  def moveToHeader(): Unit = js.native
  
  def onLayout(e: LayoutChangeEvent): Unit = js.native
  
  def onLayoutContainer(e: LayoutChangeEvent): Unit = js.native
  
  def startMove(): Unit = js.native
  
  var texts: js.Any = js.native
  
  def tryStart(): Unit = js.native
  
  var twidth: Double = js.native
  
  var width: Double = js.native
}
