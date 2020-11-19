package typingsSlinky.devtoolsProtocol.mod.Protocol.Input

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchCancel
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchEnd
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchMove
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchStart
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchEnd
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchMove
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.touchCancel
*/
trait DispatchTouchEventRequestType extends js.Object
object DispatchTouchEventRequestType {
  
  @scala.inline
  def TouchCancel: touchCancel = "touchCancel".asInstanceOf[touchCancel]
  
  @scala.inline
  def TouchEnd: touchEnd = "touchEnd".asInstanceOf[touchEnd]
  
  @scala.inline
  def TouchMove: touchMove = "touchMove".asInstanceOf[touchMove]
  
  @scala.inline
  def TouchStart: touchStart = "touchStart".asInstanceOf[touchStart]
}
