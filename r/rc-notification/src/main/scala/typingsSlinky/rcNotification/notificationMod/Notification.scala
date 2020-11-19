package typingsSlinky.rcNotification.notificationMod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification
  extends Component[NotificationProps, NotificationState, js.Any] {
  
  def add(notice: NoticeContent): Unit = js.native
  def add(notice: NoticeContent, holderCallback: HolderReadyCallback): Unit = js.native
  
  def getTransitionName(): String = js.native
  
  var hookRefs: js.Any = js.native
  
  def remove(key: String): Unit = js.native
  def remove(key: Double): Unit = js.native
}
