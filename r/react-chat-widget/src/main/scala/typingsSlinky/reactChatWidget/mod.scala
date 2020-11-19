package typingsSlinky.reactChatWidget

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactChatWidget.anon.Autofocus
import typingsSlinky.reactChatWidget.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-chat-widget", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addLinkSnippet(link: String): Unit = js.native
  
  def addResponseMessage(input: String): Unit = js.native
  
  def addUserMessage(input: String): Unit = js.native
  
  def dropMessages(): Unit = js.native
  
  def isWidgetOpened(): Boolean = js.native
  
  def renderCustomComponent[P](component: ReactComponentClass[P], props: P, showAvatar: Boolean): Unit = js.native
  
  def setQuickButtons(input: js.Array[Label]): Unit = js.native
  
  def toggleInputDisabled(): Unit = js.native
  
  def toggleMsgLoader(): Unit = js.native
  
  def toggleWidget(): Unit = js.native
  
  @js.native
  class Widget ()
    extends Component[Autofocus, js.Object, js.Any]
}
