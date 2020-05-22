package typingsSlinky.rcNotification.notificationMod

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification
  extends Component[NotificationProps, NotificationState, js.Any] {
  var hookRefs: js.Any = js.native
  def add(notice: NoticeContent): Unit = js.native
  def add(notice: NoticeContent, holderCallback: HolderReadyCallback): Unit = js.native
  def getTransitionName(): String = js.native
  def remove(key: Key): Unit = js.native
}

