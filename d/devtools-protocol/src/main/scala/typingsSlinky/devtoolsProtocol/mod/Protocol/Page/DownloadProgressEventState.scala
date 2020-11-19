package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.canceled
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.completed
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.inProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.inProgress
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.completed
  - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.canceled
*/
trait DownloadProgressEventState extends js.Object
object DownloadProgressEventState {
  
  @scala.inline
  def Canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @scala.inline
  def Completed: completed = "completed".asInstanceOf[completed]
  
  @scala.inline
  def InProgress: inProgress = "inProgress".asInstanceOf[inProgress]
}
